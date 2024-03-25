class car:
    def __init__(self):
        self.acc = False
        self.br = False
        self.clutch = False

    def start(self):
        self.acc = True
        self.clutch = True
        print("Car is started")
    
car1 = car()
car1.start()