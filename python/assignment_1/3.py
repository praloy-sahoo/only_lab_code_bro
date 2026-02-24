from itertools import compress, count, islice

# count(1) creates an infinite iterator starting from 1
# It generates: 1, 2, 3, 4, 5, ...
numbers = count(1)

# Selector generator for odd numbers
# For each number from count(1), it returns True if number is odd
odd_selector = (n % 2 != 0 for n in count(1))

# Selector generator for even numbers
# It returns True if number is even
even_selector = (n % 2 == 0 for n in count(1))

# compress(data, selectors)
# It selects elements from 'data' where corresponding selector is True
# islice(..., 10) limits the output to first 10 elements
first_10_odds = list(islice(compress(count(1), odd_selector), 10))

# Same logic for even numbers
first_10_evens = list(islice(compress(count(1), even_selector), 10))

# Print results
print("First 10 Odd Numbers:", first_10_odds)
print("First 10 Even Numbers:", first_10_evens)
