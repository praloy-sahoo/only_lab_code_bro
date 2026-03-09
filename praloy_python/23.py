"""
Name -> Praloy Sahoo
Roll -> 002410501095

23. You are given a string, and you have to validate whether it's a valid Roman numeral.
If it is valid, print True. Otherwise, print False. The number will be between 1 and 3999.
"""

import re

# Regular expression for Roman numerals (1–3999)
pattern = r"^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"

roman = input("Enter Roman numeral: ").upper()

if re.match(pattern, roman):
    print(True)
else:
    print(False)