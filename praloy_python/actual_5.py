"""
Name -> Praloy Sahoo
Roll -> 002410501095

24. Write a generator function to produce the Fibonacci sequence and print
the first 7 Fibonacci numbers using next(). Also write a program to check
whether a user-entered number is a Fibonacci number or not.
"""

# Part 1: Generator for Fibonacci

def fibonacci():
    a = 0
    b = 1
    count = 0

    while count < 7:   # first 7 numbers
        yield a
        a, b = b, a + b
        count += 1


# Using next() to get values
fib_gen = fibonacci()

print("First 7 Fibonacci numbers:")

for _ in range(7):
    print(next(fib_gen))


# Part 2: Check if user number is Fibonacci

num = int(input("\nEnter a number to check: "))

a = 0
b = 1
is_fibo = False

while a <= num:
    if a == num:
        is_fibo = True
        break
    a, b = b, a + b

if is_fibo:
    print("It is a Fibonacci number.")
else:
    print("It is NOT a Fibonacci number.")