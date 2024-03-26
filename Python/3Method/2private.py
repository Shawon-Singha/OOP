class account:
    def __init__(self, acc_no, ac_pass):
        self.acc_no = acc_no
        self.__ac_pass = ac_pass  # private attribute

    # Method to access private attribute
    def get_pass(self):
        print(self.__ac_pass)

class person:
    __name = "Shawon"

    def __heello(self):
        print("Hello ",end="")

    def get(self):
        self.__heello()

    def get_name(self):
        print(self.__name)
    

p = person()
p.get()
p.get_name()

print("\t\t\tWelcome to our bank")

ac1 = account("1234", "abc23")
print("Your account number is ",ac1.acc_no)
print("Your pass word is ",ac1.get_pass())
print("Warning! Please, do not forget your password")