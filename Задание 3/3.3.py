# -*- coding: utf-8 -*-
def x():
    a = int(input('Введите число a:'))
    b = int(input('Введите число b:'))
    for i in range(a, b - 1, -1):
        if i % 2 !=0:
            print(i)
print(x())