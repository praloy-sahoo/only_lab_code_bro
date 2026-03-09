# 12. Create a BankAccount class. Your class should support these methods:
# deposit, withdraw, get_balance, change_pin. Create one SavingsAccount class
# that behaves like a BankAccount class but also has an interest rate and a
# method that increases the balance by the appropriate amount of interest.
# Create another FeeSavingsAccount class that behaves just like a SavingsAccount
# class but charges a fee every time you withdraw money. The fee should be set
# in the constructor and deducted before each withdrawal.

# Name: Praloy Sahoo
# Roll No: 0020501095


# -------------------------
# Base Class
# -------------------------

class BankAccount:

    def __init__(self, balance, pin):
        self.balance = balance
        self.pin = pin

    def deposit(self, amount):
        self.balance += amount
        print("Deposited:", amount)

    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
            print("Withdrawn:", amount)
        else:
            print("Insufficient balance")

    def get_balance(self):
        return self.balance

    def change_pin(self, old_pin, new_pin):
        if self.pin == old_pin:
            self.pin = new_pin
            print("PIN changed successfully")
        else:
            print("Incorrect old PIN")


# -------------------------
# SavingsAccount
# -------------------------

class SavingsAccount(BankAccount):

    def __init__(self, balance, pin, interest_rate):
        super().__init__(balance, pin)
        self.interest_rate = interest_rate

    def add_interest(self):
        interest = self.balance * self.interest_rate / 100
        self.balance += interest
        print("Interest added:", interest)


# -------------------------
# FeeSavingsAccount
# -------------------------

class FeeSavingsAccount(SavingsAccount):

    def __init__(self, balance, pin, interest_rate, fee):
        super().__init__(balance, pin, interest_rate)
        self.fee = fee

    def withdraw(self, amount):
        total = amount + self.fee

        if total <= self.balance:
            self.balance -= total
            print("Withdrawn:", amount)
            print("Fee charged:", self.fee)
        else:
            print("Insufficient balance (including fee)")


# -------------------------
# User Interaction
# -------------------------

print("Create Your Account")

balance = float(input("Enter initial balance: "))
pin = int(input("Set your PIN: "))
interest = float(input("Enter interest rate (%): "))
fee = float(input("Enter withdrawal fee: "))

account = FeeSavingsAccount(balance, pin, interest, fee)

while True:
    print("\n--- MENU ---")
    print("1. Deposit")
    print("2. Withdraw")
    print("3. Check Balance")
    print("4. Change PIN")
    print("5. Add Interest")
    print("6. Exit")

    choice = input("Enter choice: ")

    if choice == "1":
        amount = float(input("Enter amount to deposit: "))
        account.deposit(amount)

    elif choice == "2":
        amount = float(input("Enter amount to withdraw: "))
        account.withdraw(amount)

    elif choice == "3":
        print("Current Balance:", account.get_balance())

    elif choice == "4":
        old_pin = int(input("Enter old PIN: "))
        new_pin = int(input("Enter new PIN: "))
        account.change_pin(old_pin, new_pin)

    elif choice == "5":
        account.add_interest()

    elif choice == "6":
        print("Thank you for using the system.")
        break

    else:
        print("Invalid choice")