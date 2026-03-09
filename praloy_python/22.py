"""
Name -> Praloy Sahoo
Roll -> 002410501095

22. There is a complex matrix script. The matrix script is a X grid of strings.
It consists of alphanumeric characters, spaces and symbols (!,@,#,$,%,&).
If there are symbols or spaces between two alphanumeric characters of the
decoded script, replace them with a single space for readability.
Print the decoded matrix script.
"""

import re

# read matrix size
n, m = map(int, input("Enter N and M: ").split())

matrix = []

# read matrix rows
for _ in range(n):
    matrix.append(input())

# decode column-wise
decoded = ""
for col in range(m):
    for row in range(n):
        decoded += matrix[row][col]

# replace symbols between alphanumeric characters with space
decoded = re.sub(r'(?<=\w)[^A-Za-z0-9]+(?=\w)', ' ', decoded)

print("Decoded Script:")
print(decoded)


""""
7 3
Tsi
h%x
i #
sM 
$a 
#t%
ir!

This$#i s% Matrix#  !
This is Matrix
(?<=\w)[^A-Za-z0-9]+(?=\w)
"""