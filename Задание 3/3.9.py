# -*- coding: utf-8 -*-
n=int(input("введите колличество чисел:"))
a=0
b=1
sum=1
if n==1:
    print(0)
elif  n >1:
    for i in range (2,n):
        k=b
        b=a+b
        a=k
        sum+=b
    print (sum)