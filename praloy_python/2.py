coupons = {
    "monday": 10,
    "tuesday":15,
    "wednesday":20,
    "thrusday":26,
    "friday":30,
    "saturday":35
}

day = input("which day is it").lower()

if day in coupons:
    print(coupons[day])
else:
    print("invalid day")    