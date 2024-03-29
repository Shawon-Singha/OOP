class car:
    color = "Black"
    @staticmethod
    def start():
        print("car started")

    @staticmethod
    def stop():
        print("Car stoped")


class toyotaCar(car):
    def __init__(self,name):
        self.name = name

car1 = toyotaCar("abc")
car2 = toyotaCar("xyz")

print(car1.stop())
print(car1.color) 