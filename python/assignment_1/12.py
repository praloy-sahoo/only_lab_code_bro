class BankAccount:
    def __init__(self, balance, pin):
        self.balance = balance
        self.pin = pin

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            return "Deposit successful"
        return "Invalid deposit amount"

    def withdraw(self, amount):
        if amount > self.balance:
            return "Insufficient balance"
        self.balance -= amount
        return "Withdrawal successful"

    def get_balance(self):
        return self.balance

    def change_pin(self, old_pin, new_pin):
        if old_pin == self.pin:
            self.pin = new_pin
            return "PIN changed successfully"
        return "Incorrect old PIN"


# ---------------------------------------

class SavingsAccount(BankAccount):
    def __init__(self, balance, pin, interest_rate):
        super().__init__(balance, pin)
        self.interest_rate = interest_rate

    def add_interest(self):
        interest = self.balance * self.interest_rate
        self.balance += interest
        return "Interest added"


# ---------------------------------------

class FeeSavingsAccount(SavingsAccount):
    def __init__(self, balance, pin, interest_rate, fee):
        super().__init__(balance, pin, interest_rate)
        self.fee = fee

    def withdraw(self, amount):
        total_amount = amount + self.fee
        
        if total_amount > self.balance:
            return "Insufficient balance (including fee)"
        
        self.balance -= total_amount
        return "Withdrawal successful (fee deducted)"
    
acc = FeeSavingsAccount(1000, 1234, 0.05, 10)

print(acc.deposit(200))
print(acc.withdraw(100))
print(acc.add_interest())
print("Balance:", acc.get_balance())