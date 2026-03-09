# 6. Write a simple program which loops over a list of user data (tuples containing a username,
# email and age) and adds each user to a directory if the user is at least 16 years old.
# Do not store the age. Raise different exceptions for:
# 1) username not unique
# 2) age not a positive integer
# 3) user under 16
# 4) invalid email address

# Name: Praloy Sahoo
# Roll No: 0020501095


# Custom Exceptions


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




directory = {}
usernames = set()

n = int(input("How many users to enter? "))

for _ in range(n):
    try:
        username = input("Enter username: ")
        email = input("Enter email: ")
        age_input = input("Enter age: ")

        # check age is a number
        if not age_input.isdigit():
            raise InvalidAgeError("Age must be a positive integer")

        age = int(age_input)

        # check username uniqueness
        if username in usernames:
            raise UsernameNotUniqueError("Username already exists")

        if age <= 0:
            raise InvalidAgeError("Age must be positive")

        if age < 16:
            raise UnderAgeError("User is under 16")

        # simple email validation
        if "@" not in email or "." not in email.split("@")[-1]:
            raise InvalidEmailError("Invalid email format")

        # add valid user to directory
        directory[username] = email
        usernames.add(username)

        print("User added successfully.\n")

    except UserError as e:
        print("Error:", e)
        print("Moving to next user...\n")


print("Final Directory:")
print(directory)