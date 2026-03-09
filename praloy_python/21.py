"""
Name -> Praloy Sahoo
Roll -> 002410501095

21. Write a python program to identify and extract numerical chunks from a text file and
convert them into words; e.g.; 1992 -> "nineteen hundred and ninety two"
"""

import re

# basic number to word mapping
ones = ["", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
teens = ["ten", "eleven", "twelve", "thirteen", "fourteen",
         "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"]
tens = ["", "", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"]


def number_to_words(n):
    n = int(n)

    if n < 10:
        return ones[n]

    if n < 20:
        return teens[n - 10]

    if n < 100:
        return tens[n // 10] + " " + ones[n % 10]

    if n < 1000:
        return ones[n // 100] + " hundred " + number_to_words(n % 100)

    if n < 10000:
        return ones[n // 1000] + " thousand " + number_to_words(n % 1000)

    return str(n)


# read file
filename = "input.txt"

with open(filename, "r") as file:
    text = file.read()

# find numbers in text
numbers = re.findall(r'\d+', text)

print("Numbers found:", numbers)

print("\nNumbers in words:")

for num in numbers:
    print(num, "->", number_to_words(num))



""""
I was born in 1992 and my friend in 2001.
We met in 2015.


Numbers found: ['1992', '2001', '2015']

Numbers in words:
1992 -> one thousand nine hundred ninety two
2001 -> two thousand one
2015 -> two thousand fifteen
"""   