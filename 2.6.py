# -*- coding: utf-8 -*-
def x():
    print("Введите 4 числа 1 до 8")
    a=int(input())
    b=int(input())
    c=int(input())
    d=int(input())
    if (a+b+c+d)%2==0:
        return "да"
    else:
        return"нет"    
print(x())   