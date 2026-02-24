# Question 8

N = 50

# Anonymous function (lambda)
check_multiple = lambda x: x % 5 == 0

multiples = []

# Loop through numbers from 1 to 50
for number in range(1, N + 1):
    if check_multiple(number):   # check if multiple of 5
        multiples.append(number)

print("Multiples of 5 up to 50 are:")
print(multiples)
