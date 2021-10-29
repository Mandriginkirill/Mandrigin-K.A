# -*- coding: utf-8 -*-
def x():
    sum = 0
    n = int(input('Введите n:'))
    for i in range (1, n + 1):
        sum += i**3
    print(sum)
print(x())