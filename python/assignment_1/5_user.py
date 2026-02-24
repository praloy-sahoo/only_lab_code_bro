# ----------------------
# Custom Exceptions
# ----------------------

class UserError(Exception):
    pass

class UsernameNotUniqueError(UserError):
    pass

class InvalidAgeError(UserError):
    pass

class UnderAgeError(UserError):
    pass

class InvalidEmailError(UserError):
    pass


# ----------------------
# Directory Storage
# ----------------------

directory = {}
usernames = set()

n = int(input("How many users to enter? "))

for _ in range(n):
    try:
        username = input("Enter username: ")
        email = input("Enter email: ")
        age_input = input("Enter age: ")

        # Convert age to integer
        if not age_input.isdigit():
            raise InvalidAgeError("Age must be a positive integer")

        age = int(age_input)

        # Username unique check
        if username in usernames:
            raise UsernameNotUniqueError("Username already exists")

        # Age positive check
        if age <= 0:
            raise InvalidAgeError("Age must be positive")

        # Under 16 check
        if age < 16:
            raise UnderAgeError("User is under 16")

        # Simple email validation
        if "@" not in email or "." not in email.split("@")[-1]:
            raise InvalidEmailError("Invalid email format")

        # Add valid user
        directory[username] = email
        usernames.add(username)

        print("User added successfully.\n")

    except UserError as e:
        print("Error:", e)
        print("Moving to next user...\n")


print("Final Directory:")
print(directory)
