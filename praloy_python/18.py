# 18. Use superposition and non-superposition to compute power of following values:
# (2,4), (2,3), (1,9), (0,9), (0,0). Use try/except to check errors.

# Name: Praloy Sahoo
# Roll No: 0020501095


# Superposition (normal function)
def power(base, exp):
    return base ** exp


# Non-superposition (anonymous lambda function)
power_lambda = lambda base, exp: base ** exp


values = [(2,4), (2,3), (1,9), (0,9), (0,0)]

print("Using normal function:")

for b, e in values:
    try:
        print(b, "^", e, "=", power(b, e))
    except Exception as err:
        print("Error:", err)


print("\nUsing lambda function:")

for b, e in values:
    try:
        print(b, "^", e, "=", power_lambda(b, e))
    except Exception as err:
        print("Error:", err)
        