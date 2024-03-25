class student:
    def __init__(self,name,marks):
        self.name = name
        self.marks = marks

    @staticmethod
    def hello():
        print("This is a static method")

    def getAvg(self):
        sum = 0
        for value in self.marks:
            sum += value
        print("Hi",self.name, "Your average marks is:",sum/3)

s = student("Shawon",[90,89,88])
s.getAvg()
s.hello()


