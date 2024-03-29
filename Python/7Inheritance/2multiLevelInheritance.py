#Multi Level Inheritance

class car:
    def start(self):
        print("Car started")

    def stop(self):
        print("Car stoped")


class toyotaCar(car):
    def __init__(self,brand):
        self.brand = brand


class bmw(toyotaCar):
    def __init__(self,type):
        self.type = type


toyo= toyotaCar("sClass")
bmw1 = bmw("Classic")

print(toyo.brand)
print(bmw1.type)
bmw1.start()
print("You reached and",end=" ")
bmw1.stop()

