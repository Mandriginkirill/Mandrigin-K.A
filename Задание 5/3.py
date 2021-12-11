# -*- coding: utf-8 -*-
def x():
    a=int(input("введите число:"))
    s=1
    k=0
    while a>s:
        s=s*2
        k=k+1
    if s>a:
        print ("показатель степени:",s/2)
        print("степень:",k-1)
    elif a==s:
        print("показатель степени:",s)
        print("степень:",k)
    return "Конец"
print (x())