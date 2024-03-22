class student:
    def __init__(self,fullname):  #no need to declare exactly 'self',use other name
        self.name = fullname
        print("I am inside constructor")

s1 = student("Karan")
print(s1.name)