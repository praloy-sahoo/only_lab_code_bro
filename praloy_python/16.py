# 16. Create a dictionary that maps stock names to prices, which will keep insertion
# order. Find minimum price, maximum price and sort items according to their prices
# in the first dictionary using lambda. Create another second stock dictionary.
# Find items that are only in first dictionary and items whose prices do not match.
# Remove duplicate items from list dictionary. Sort both dictionaries for increasing prices.
# Group items in first dictionary by price in multiple of 500.
# Find an item with price = 800 from both dictionaries.

# Name: Praloy Sahoo
# Roll No: 0020501095

from collections import defaultdict

# First stock dictionary
stock1 = {
    "Apple": 1200,
    "Google": 1500,
    "Microsoft": 800,
    "Amazon": 2000,
    "Tesla": 800
}

# Second stock dictionary
stock2 = {
    "Apple": 1200,
    "Google": 1400,
    "Netflix": 900,
    "Tesla": 800
}


# Min and Max price

print("Minimum price:", min(stock1.values()))
print("Maximum price:", max(stock1.values()))


# Sort dictionary by price

sorted_stock1 = dict(sorted(stock1.items(), key=lambda x: x[1]))
print("\nSorted stock1:", sorted_stock1)


# Items only in first dictionary

only_first = set(stock1.keys()) - set(stock2.keys())
print("\nItems only in first dictionary:", only_first)


# Items whose prices do not match

price_mismatch = []

for item in stock1:
    if item in stock2 and stock1[item] != stock2[item]:
        price_mismatch.append(item)

print("Price mismatch items:", price_mismatch)


# Remove duplicate prices

unique_prices = list(set(stock1.values()))
print("\nUnique prices:", unique_prices)


# Sort both dictionaries

sorted_stock2 = dict(sorted(stock2.items(), key=lambda x: x[1]))

print("\nSorted stock1:", sorted_stock1)
print("Sorted stock2:", sorted_stock2)


# Group prices in multiples of 500

groups = defaultdict(list)

for name, price in stock1.items():
    key = (price // 500) * 500
    groups[key].append(name)

print("\nGrouped by price (multiple of 500):")
for k, v in groups.items():
    print(k, ":", v)


# Find item with price = 800

print("\nItems with price 800:")

for name, price in stock1.items():
    if price == 800:
        print("Stock1:", name)

for name, price in stock2.items():
    if price == 800:
        print("Stock2:", name)