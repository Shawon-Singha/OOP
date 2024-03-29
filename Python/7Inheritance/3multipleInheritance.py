class A:
    var1 = "This is the first class"

class B:
    var2 = "This is the second class"
    name = 'Shawon'

class C(A,B):
    var3 = "This is the third class"

c = C()
print(c.var1)
print(c.var2)
print(c.var3)
print(c.name)