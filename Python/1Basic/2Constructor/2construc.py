class student:
    #default constructor
    def __init__(self):
        pass
    
    uniName = "DIU"
    #parameter constructor
    def __init__(self,name,marks):
        self.name = name
        self.marks = marks

s1 = student("Shawon",8)
print(s1.name,s1.marks)

s2 = student("Anik",9)
print(s2.name,s2.marks)
print(s2.uniName)

