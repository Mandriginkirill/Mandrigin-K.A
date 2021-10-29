# -*- coding: utf-8 -*-
def x():
    a=str(input("напишите слова через пробел:"))
    b=a[:a.find(" ")]
    c=a[a.find(" "):]
    print (c,"",b)
print (x())
