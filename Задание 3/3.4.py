# -*- coding: utf-8 -*-
def x():
    s = 0
    n = int(input('Введите число n:'))
    for i in range(n):
        a = int(input('Введите число:'))
        s += a
        print('Сумма всех чисел=', s)
    return "Конец"
print(x())