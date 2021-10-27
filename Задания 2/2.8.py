# -*- coding: utf-8 -*-
def sovpadenie():
    x = int(input("Введите первое число:"))
    y = int(input("Введите второе число:"))
    z = int(input("Введите третье число:"))
    if x==y==z:
        return'3'
    elif x == y or z==y or x == z:
        return'2'
    else:
        return'0'
print(sovpadenie())