# 10. Write a code which yields all terms of the geometric progression 
# a, aq, aq², aq³, ... When the term becomes greater than 100000 
# the generator stops. Compute total time and time within the loop.

# Name: Praloy Sahoo
# Roll No: 0020501095

import time

# generator function for geometric progression
def geometric_progression(a, q):
    term = a

    while term <= 100000:
        yield term
        term = term * q

    return   # stop generator


# initial values
a = 2
q = 3

# measure total time
start_total = time.time()

# measure loop time
start_loop = time.time()

for value in geometric_progression(a, q):
    print(value)

end_loop = time.time()
end_total = time.time()

print("\nTime inside loop:", end_loop - start_loop)
print("Total execution time:", end_total - start_total)