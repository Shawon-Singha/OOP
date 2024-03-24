class student():
    def __init__(self,fullname):
        self.name = fullname
    
    def hello(self):
        print("Hello")

s1 = student("Shawon")
s1.hello()
print(s1.name)