# -*- coding: utf-8 -*-
def x():
    N=int(input("введите  количество чисел из ряда Фибоначчи:"))
    K=int(input("введите порядковый номер в ряду, с которого нужно начать:"))
    a=0
    b=1
    sum=0
    if K==0:                             #задача 3,11 решена с 2 циклами
        print("N должно быть больше 0")
    elif K>0:
        for i in range (3,K+N):
            c=a+b
            a=b
            b=c
            sum+=b
    print(sum)
    return "Конец"
print(x())