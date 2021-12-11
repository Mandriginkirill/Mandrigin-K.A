# -*- coding: utf-8 -*-
def x():
    r=int(input("введите число:"))
    t=int(input("введите еще одно число:"))
    y=0
    while t!=0:
        if t>r:
            y=y+1
        r=t
        t=int(input("введите следующее число:"))
    print(y)
    return "Конец"
print (x())