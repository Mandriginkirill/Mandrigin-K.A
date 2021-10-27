# -*- coding: utf-8 -*-
a=int(input("Введите a:"))
b=int(input("Введите b:"))
if b>=a:
    for i in range(a,b+1):
        print(i)
elif  b<a:
    print("ошибка")