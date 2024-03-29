class car:
    def __init__(self,type):
        self.type = type
    
    @staticmethod
    def start(self):
        print("Car started")

    @staticmethod
    def stop(self):
        print("Car stop")

class toyotaCar(car):
    def __init__(self,name,type):
        self.name = name
        super().__init__(type)  #called super class constructor and same for attribute

car1 = toyotaCar("sClass","Classic")
print(car1.name)
print(car1.type)
