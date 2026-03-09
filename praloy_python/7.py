# 7. Write a function findfiles that recursively descends the directory tree
# for the specified directory and generates paths of all the files in the tree.

# Name: Praloy Sahoo
# Roll No: 0020501095

import os

def findfiles(directory):
    # loop through all items in the directory
    for item in os.listdir(directory):
        
        # create full path
        path = os.path.join(directory, item)

        # if it is a file → print its path
        if os.path.isfile(path):
            print(path)

        # if it is a directory → search inside it recursively
        elif os.path.isdir(path):
            findfiles(path)


# take directory path from user
folder = input("Enter folder path: ")

if os.path.isdir(folder):
    print("\nFiles found:\n")
    findfiles(folder)
else:
    print("Invalid directory path!")