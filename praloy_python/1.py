## 1. Write a prime generator program using only primes and using python loops
# Praloy Sahoo 0020501095

n = int(input("Enter the number: "))   
primes = []                            
num = 2                               

# keep generating numbers until we get n primes
while len(primes) < n:
    is_prime = True
    
    # check divisibility only with previously found primes
    for p in primes:
        if num % p == 0:
            is_prime = False
            break
    
    # if prime, add to list
    if is_prime:        
        primes.append(num)
    
    num += 1           

# print all generated primes
for i in primes:
    print(i)