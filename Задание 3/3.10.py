# -*- coding: utf-8 -*-
def x():
    N=int(input("введите  количество чисел из ряда Фибоначчи:"))
    K=int(input("введите порядковый номер в ряду, с которого нужно начать:"))
    a=0
    b=1
    d=0
    e=1
    sum1=0
    sum2=0
    if K==0:                             
        print("N должно быть больше 0")
    elif K>0:
        for i in range (3,K):
            f=d+e
            d=e
            e=f
            sum2+=e
        for i in range (3,K + N):
            c=a+b
            a=b
            b=c
            sum1+=b
        if K==1 or K==2:
            print(sum1-sum2+1)
        elif K>2:
            print(sum1-sum2)
    return "Конец"
print(x())