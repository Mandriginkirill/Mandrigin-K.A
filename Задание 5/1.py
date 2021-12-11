# -*- coding: utf-8 -*-
def x():
    a=int(input("введите число:"))
    s=1
    while s**2<=a:
        print(s**2)
        s+=1
    return "Конец"
print (x())