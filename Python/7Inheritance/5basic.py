class person:
    name = "Anik"

    def change(self,name):
        self.name = name

p1 = person()
p1.change("Shawon")
print(p1.name)
print(person.name)

#try to update name in all code
class person:
    name = "Anik"

    def change(self,name):
        self.name = name
        person.name = name #first method
        # self.__class__.name = name #other method

#here change the name in all place
p1 = person()
p1.change("Shawon")
print(p1.name)
print(person.name)

#other way
class person:
    name = "Anik"

    @classmethod
    def change(self,name):
        self.name = name 

p1 = person()
p1.change("Shawon")
print(p1.name)
print(person.name)
