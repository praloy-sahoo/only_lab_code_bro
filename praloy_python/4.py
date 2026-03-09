# 4. Write a regular expression to validate a phone number
# Praloy Sahoo 0020501095

import re

# pattern: start with 6-9 and total 10 digits
pattern = r'^[6-9]\d{9}$'

number = input("Enter phone number: ")

# check if number matches the pattern
if re.match(pattern, number):
    print("Valid phone number")
else:
    print("Invalid phone number")