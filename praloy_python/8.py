# 8. Create a list of all the numbers up to N = 50 which are multiples of five using anonymous function.

# Name: Praloy Sahoo
# Roll No: 0020501095

N = 50

# anonymous function to check if a number is multiple of 5
check_multiple = lambda x: x % 5 == 0

multiples = []

# loop through numbers from 1 to 50
for number in range(1, N + 1):
    if check_multiple(number):
        multiples.append(number)

print("Multiples of 5 up to 50:")
print(multiples)