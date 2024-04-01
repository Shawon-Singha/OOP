class complex:
    def __init__(self,real,img):
        self.real = real
        self.img = img

    def show(self):
        print(self.real , "i + ",self.img,"j" ) 

    def add(num1,num2):
        newR = num1.real + num2.real
        newI = num1.img + num2.img
        return complex(newR,newI)


num1 = complex(1,3)
num2 = complex(4,6)

num3 = num1.add(num2)
num3.show()