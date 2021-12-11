# -*- coding: utf-8 -*-
def  x():
    a=input("введите строку минимум с 2 буквами h:")
    b=a.find("h")
    c=a.rfind("h")
    if b==0:
        print(a[:0]+a[c+1:])
    else:
        print(a[:b]+a[c+1:])
    return "Конец"
print (x())
