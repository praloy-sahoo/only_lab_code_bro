


# for num in range(2,n+1):
#     is_prime = True
#     for i in range(2,num):
#         if(num%i==0):
#           is_prime = False
#           break
#     if(is_prime):
#         print(num)

n = int(input("Enter the number: "))
primes = []
num = 2

while len(primes) < n:
    is_prime = True
    
    for p in primes:
        if num % p == 0:
            is_prime = False
            break
    
    if is_prime:        
        primes.append(num)
    
    num += 1           

for i in primes:
    print(i)

   