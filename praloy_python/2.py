# Write a discount coupon code using dictionary in Python with different rate coupons for each day of the week.
# Praloy Sahoo 0020501095


coupons = {
    "monday": 10,
    "tuesday": 15,
    "wednesday": 20,
    "thursday": 25,
    "friday": 30,
    "saturday": 35,
    "sunday": 40
}

day = input("Which day is it? ").lower()   # take day as input

# check if the day exists in dictionary
if day in coupons:
    print("Discount rate:", coupons[day], "%")
else:
    print("Invalid day")