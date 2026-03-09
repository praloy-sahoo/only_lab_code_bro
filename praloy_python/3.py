# 3. Print first 10 odd and even numbers using iterators and compress
# Praloy Sahoo 0020501095

from itertools import compress, count, islice

# selector that marks odd numbers
odd_selector = (n % 2 != 0 for n in count(1))

# selector that marks even numbers
even_selector = (n % 2 == 0 for n in count(1))

# get first 10 odd numbers
first_10_odds = list(islice(compress(count(1), odd_selector), 10))

# get first 10 even numbers
first_10_even = list(islice(compress(count(1), even_selector), 10))

print("First 10 even numbers:", first_10_even)
print("First 10 odd numbers:", first_10_odds)