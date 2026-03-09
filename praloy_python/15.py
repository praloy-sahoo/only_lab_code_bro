# 15. Make a list of the largest or smallest N items in a collection.

# Name: Praloy Sahoo
# Roll No: 0020501095

import heapq

numbers = [45, 12, 78, 3, 56, 89, 21, 67]

N = int(input("Enter value of N: "))

# N largest numbers
largest = heapq.nlargest(N, numbers)

# N smallest numbers
smallest = heapq.nsmallest(N, numbers)

print("Largest", N, "items:", largest)
print("Smallest", N, "items:", smallest)