# Question 9

import string

letters = string.ascii_lowercase

print("Lowercase letters with numbering:")

for index, letter in enumerate(letters, start=1):
    print(index, letter)
