# -*- coding: utf-8 -*-
def x():
    k=0
    x=int(input("введите число:"))
    while (x!=0):   
        x=int(input("введите число:"))
        k=k+1
    print(k)
    return "Конец"
print (x())