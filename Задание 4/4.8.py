# -*- coding: utf-8 -*-
def  x():
    a=input("введите строку минимум с 2 буквами h:")
    b=a.find("h")
    c=a.rfind("h")
    print(a[c:b:-1]+"h")
    return "Конец"
print (x())