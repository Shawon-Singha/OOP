class account:
    def __init__(self, acc_no, ac_pass):
        self.acc_no = acc_no
        self.__ac_pass = ac_pass  # private attribute

    # Method to access private attribute
    def get_pass(self):
        print(self.__ac_pass)

ac1 = account("1234", "abc23")
print(ac1.acc_no)
ac1.get_pass()  # Corrected method call
