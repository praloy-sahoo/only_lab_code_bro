# 13. With an operator overloading for len which shows string length for any given string
# and return only length of repetitive words with the text if the text has some repetitive parts.
# Determine the most frequently occurring words using most_common.
# Count string length in 4 different ways.

# Name: Praloy Sahoo
# Roll No: 0020501095


from collections import Counter

class MyString:
    def __init__(self, text):
        self.text = text

    # Operator overloading for len()
    def __len__(self):
        return len(self.text)

    # Length of repetitive words only
    def repetitive_length(self):
        words = self.text.split()
        freq = Counter(words)
        total = 0
        for word, count in freq.items():
            if count > 1:
                total += len(word)
        return total

    # Most frequent word using most_common()
    def most_frequent(self):
        words = self.text.split()
        freq = Counter(words)
        return freq.most_common(1)


# Create object
obj = MyString("apple banana apple mango apple banana")

# Using overloaded len
print("Total length:", len(obj))

# Length of repeated words
print("Length of repetitive words:", obj.repetitive_length())

# Most frequent word
print("Most frequent word:", obj.most_frequent())


# String length in 4 different ways
s = "apple banana apple mango apple banana"

# Method 1: len()
print("Method 1:", len(s))

# Method 2: loop
count = 0
for i in s:
    count += 1
print("Method 2:", count)

# Method 3: sum()
print("Method 3:", sum(1 for _ in s))

def func(text):
    count = 0
    for i in text:
        count += 1
    return count

print("Method 2 (function):", func(s))

# Method 4: recursion
def recursive_length(s):
    if s == "":
        return 0
    return 1 + recursive_length(s[1:])

print("Method 4:", recursive_length(s))