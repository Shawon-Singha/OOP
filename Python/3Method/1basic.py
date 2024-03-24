class student():
    def __init__(self,fullname,marks):
        self.name = fullname
        self.marks = marks
    
    def hello(self):
        print("Hello",self.name)

    def get_marks(self):
        return self.marks

s1 = student("Shawon",76)
s1.hello()
print(s1.get_marks())
