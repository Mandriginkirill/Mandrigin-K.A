# -*- coding: utf-8 -*-
def x():
    x=float(input("введите сколько пробежал в 1 день:")) 
    y=float(input("введите сколько км он должен пробежать:"))
    day=1
    while (x<=y):
        x=x*1.1
        day=day+1
    print(day)
    return "Конец"
print (x())