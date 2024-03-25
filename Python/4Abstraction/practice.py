class account:
    def __init__(self,bal,acc):
        self.balance = bal
        self.account_no = acc

    def debit(self,amount):
        self.balance -= amount
        print("Taka",amount ,"debit from your account")
        print("Now your balance is : ",self.get_balance())

    def credit(self,amount):
        self.balance += amount
        print("Taka",amount," is credited to your account")
        print("Now your total balance is : ",self.get_balance())

    def get_balance(self):
        return self.balance

ac1 = account(100001,27710)
ac1.debit(1)
ac1.credit(99)
