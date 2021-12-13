# -*- coding: utf-8 -*-
def x():
    N=int(input("введите колличество чисел:"))
    a=0
    b=1
    sum=0
    if N==1:
        print(0)
    elif  N >1:
        for i in range (2,N):
            k=a+b
            a=b
            b=k
            sum+=b
        print (sum+1)
    return "Конец"
print(x())