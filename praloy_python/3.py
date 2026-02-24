from itertools import compress,count,islice

odd_selector = (n%2!=0 for n in count(1))

even_selector  =(n%2==0 for n in count(1))



first_10_odds = list(islice(compress(count(1),odd_selector),10))

first_10_even = list(islice(compress(count(1),even_selector),10))

print(first_10_even)
print(first_10_odds)
