# -*- coding: utf-8 -*-
def dolki():
    n=int(input("Введите первое число:"))
    m=int(input("Введите второе число:"))
    k = int(input("Введите количество долек:"))
    if (n*m>k and(k%m==0 or k % n==0)):
        return 'Да'
    else:
        return 'Нет'
print(dolki())