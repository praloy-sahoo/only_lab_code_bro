import os

def findfiles(directory):
    # Loop through everything inside the directory
    for item in os.listdir(directory):
        # Create full path
        path = os.path.join(directory, item)

        # If it is a file → print it
        if os.path.isfile(path):
            print(path)

        # If it is a folder → go inside it (recursion)
        elif os.path.isdir(path):
            findfiles(path)


# --------------------
# Take input from user
# --------------------

folder = input("Enter folder path: ")

if os.path.isdir(folder):
    print("\nFiles found:\n")
    findfiles(folder)
else:
    print("Invalid directory path!")
