# -*- coding: utf-8 -*-
n=int(input("введите колличество чисел:"))
k=int(input("введите порядковый номер:"))
a=0
b=1
sum=1
if n==1 and k==1:
    print(0)
if n>k:
    for i in range (2+k,n):
        c=b
        b=a+b
        a=c
        sum+=b
    print (sum)
if n<k:
    for i in range(n,2+k):
        c=b
        b=a+b
        a=c
        sum+=b
    print (sum)