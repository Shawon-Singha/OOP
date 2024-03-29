#Multi Level Inheritance

class car:
    def start():
        print("Car started")

    def stop():
        print("Car stoped")

class toyotaCar(car):
    def __init__(self,brand):
        self.brand = brand

class bmw(toyotaCar):
    def __init__(self,type):
        self.type = type


toyo= toyotaCar("s1")
bmw1 = bmw("Classic")

print(toyo.brand)
print(bmw1.type)

