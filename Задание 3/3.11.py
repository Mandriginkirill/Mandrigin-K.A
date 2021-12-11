# -*- coding: utf-8 -*-
def x():
    N=int(input("введите  количество чисел из ряда Фибоначчи:"))
    K=int(input("введите порядковый номер в ряду, с которого нужно начать:"))
    a=0
    b=1
    sum=0
    if K==0:                             #задача 3,11 решена с 1 циклом
        print("N должно быть больше 0")
    elif K>0:
        for i in range (1,K):
            c=a+b
            a=b
            b=c
        d=a
        e=b
        for i in range (1,N):
            f=d+e
            d=e
            e=f
            sum+=e
    print(sum)
    return "Конец"
print(x())