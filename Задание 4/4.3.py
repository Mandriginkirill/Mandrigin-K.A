# -*- coding: utf-8 -*-
def x():
    a=input("введите строку:")
    print(a[(len(a)+1)//2:]+a[:(len(a)+1)//2])
print (x())