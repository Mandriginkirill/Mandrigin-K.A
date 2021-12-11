# -*- coding: utf-8 -*-
def x():
    n = int(input('Введите n:'))
    x = ""
    for i in range(1, n + 1):
        x = x + str(i)
        print(x)
    return "Конец"
print(x())