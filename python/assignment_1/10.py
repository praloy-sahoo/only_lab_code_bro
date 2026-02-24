# Question 10

import time

def geometric_progression(a, q):
    term = a

    while term <= 100000:
        yield term
        term = term * q

    return   # stop generator


# Initial values
a = 2
q = 3

# Measure total time
start_total = time.time()

# Measure time inside loop
start_loop = time.time()

for value in geometric_progression(a, q):
    print(value)

end_loop = time.time()
end_total = time.time()

print("\nTime inside loop:", end_loop - start_loop)
print("Total execution time:", end_total - start_total)
