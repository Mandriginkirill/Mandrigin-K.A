# -*- coding: utf-8 -*-
n1 = 1
n = int(input('введите n:'))
for i in range(1, n + 1):
    n1 *= i
print("Факториал",n,"=",n1)