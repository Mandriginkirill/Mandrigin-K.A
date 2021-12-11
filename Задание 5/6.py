# -*- coding: utf-8 -*-
def x():
    k=0
    x=1
    z=0
    while (x!=0):   
        x=int(input("введите число:"))
        k=k+1
        z=z+x
    print(z/(k-1))
    return "Конец"
print (x())