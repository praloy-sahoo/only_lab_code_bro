# 17. Write a function that flattens a nested dictionary structure
# like one obtained from Twitter JSON and returns a flat dictionary.

# Name: Praloy Sahoo
# Roll No: 0020501095


def flatten_dict(d, parent_key="", sep="."):
    flat = {}

    for key, value in d.items():
        new_key = parent_key + sep + key if parent_key else key

        if isinstance(value, dict):
            flat.update(flatten_dict(value, new_key, sep))
        else:
            flat[new_key] = value

    return flat


# Example nested dictionary (similar to Twitter JSON structure)
nested_data = {
    "fullname": "Alexander",
    "age": 41,
    "phoneNumbers": ["+447421234567", "+447423456789"],
    "residence": {
        "address": "Flat 13C Alexander Rd",
        "income": 75000,
        "role": "Testing, Profiling, and Dealing with Exceptions",
        "zip": 230
    },
    "city": "London",
    "country": "UK"
}

flat_data = flatten_dict(nested_data)

print("Flattened Dictionary:\n")

for k, v in flat_data.items():
    print(k, ":", v)