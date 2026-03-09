""""
name -> praloy sahoo 
roll -> 002410501095
19. Use profile/cprofile to check pythogorian triples code in python. Think about time
complexity of the code
"""

import cProfile

def pythagorain(n):
    for a in range(1,n):
        for b in range(1,n):
            for c in range(1,n):
                if a*a+b*b==c*c:
                    print(a,b,c)

cProfile.run("pythagorain(200)")
##  py 19.py