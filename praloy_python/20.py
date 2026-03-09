"""
Name -> Praloy Sahoo
Roll -> 002410501095

20. Write a python program to:
i. read lines from a file, break into tokens and convert the tokens to unique numerical
values using python dictionary.
ii. Convert lines of different lengths into lines of same length (maximum length). Use
padding if and when required.
"""

# -----------------------------
# Read lines from file
# -----------------------------

filename = "input.txt"

with open(filename, "r") as file:
    lines = file.readlines()

# -----------------------------
# Tokenize lines
# -----------------------------

tokenized_lines = []

for line in lines:
    tokens = line.strip().split()
    tokenized_lines.append(tokens)

# -----------------------------
# Create dictionary for tokens
# -----------------------------

token_dict = {}
index = 1

for tokens in tokenized_lines:
    for token in tokens:
        if token not in token_dict:
            token_dict[token] = index
            index += 1

print("Token Dictionary:")
print(token_dict)

# -----------------------------
# Convert tokens to numbers
# -----------------------------

numeric_lines = []

for tokens in tokenized_lines:
    numeric_line = []
    for token in tokens:
        numeric_line.append(token_dict[token])
    numeric_lines.append(numeric_line)

print("\nNumeric Lines:")
print(numeric_lines)

# -----------------------------
# Padding lines to same length
# -----------------------------

max_len = max(len(line) for line in numeric_lines)

for line in numeric_lines:
    while len(line) < max_len:
        line.append(0)   # padding with 0

print("\nPadded Numeric Lines:")
for line in numeric_lines:
    print(line)