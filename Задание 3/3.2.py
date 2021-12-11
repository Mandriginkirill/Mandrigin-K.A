# -*- coding: utf-8 -*-
def x():
    a=int(input("Введите a:"))
    b=int(input("Введите b:"))
    if a < b:
        for i in range (a,b+1):
            print(i)
    else:
        for i in range (a,b-1,-1):
            print(i)
    return "Конец"
print(x())