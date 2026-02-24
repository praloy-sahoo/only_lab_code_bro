# ----------------------
# Custom Exception Classes
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
# Sample Data
# ----------------------

users = [
    ("rahul", "rahul@gmail.com", 18),
    ("amit", "amitgmail.com", 20),
    ("rahul", "rahul2@gmail.com", 25),
    ("sita", "sita@gmail.com", 15),
    ("john", "john@gmail.com", -5),
]

directory = {}
collection_user_name = set()


# ----------------------
# Processing Users
# ----------------------

for username, email, age in users:
    try:
        # Username must be unique
        if username in collection_user_name:
            raise UsernameNotUniqueError("Username already exists")

        # Age must be positive integer
        if not isinstance(age, int) or age <= 0:
            raise InvalidAgeError("Age must be positive integer")

        # Age must be at least 16
        if age < 16:
            raise UnderAgeError("User is under 16")

        # Simple email validation
        if "@" not in email or "." not in email.split("@")[-1]:
            raise InvalidEmailError("Invalid email format")

        # Add to directory (without age)
        directory[username] = email
        collection_user_name.add(username)

        print(f"{username} added successfully.")

    except UsernameNotUniqueError as e:
        print(f"Username Error: {e}")

    except InvalidAgeError as e:
        print(f"Age Error: {e}")

    except UnderAgeError as e:
        print(f"Underage Error: {e}")

    except InvalidEmailError as e:
        print(f"Email Error: {e}")


print("\nFinal Directory:")
print(directory)
