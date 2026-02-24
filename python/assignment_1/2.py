coupons = {
    "monday":10,
    "tuesday":15,
    "saturday":50
}

day = input("enter  teh day").lower()
if day in coupons:
    print(coupons[day])
else:
    print("invalid day ")    