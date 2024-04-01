class complex:
    def __init__(self,real,img):
        self.real = real
        self.img = img

    def show(self):
        print(self.real , "i + ",self.img,"j" ) 


num1 = complex(1,3)
num2 = complex(4,2)
num1.show()