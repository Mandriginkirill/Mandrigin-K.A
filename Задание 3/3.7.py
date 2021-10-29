# -*- coding: utf-8 -*-
def x():
    fact = 1
    factsum = 0
    n = int(input('Введите n:'))
    for i in range(1, n + 1):
        fact *= i
        factsum += fact
    print(factsum)
print(x())