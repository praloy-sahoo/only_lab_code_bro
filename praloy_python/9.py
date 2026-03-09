# 9. Enumerate the sequence of all lowercase ASCII letters, starting from 1, using enumerate.

# Name: Praloy Sahoo
# Roll No: 0020501095

import string

# get all lowercase ASCII letters
letters = string.ascii_lowercase

print("Lowercase letters with numbering:")

# enumerate letters starting from 1
for index, letter in enumerate(letters, start=1):
    print(index, letter)