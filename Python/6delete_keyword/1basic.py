class student:
    def __init__(self,name,age):
        self.name = name
        self.age = age

s1 = student("Shawon",22)
print(s1.name," ", s1.age)

s2 = student("Anik",23)
print(s2.name," ", s2.age)

#delete object
del s1
#print(s1.name) #give an error