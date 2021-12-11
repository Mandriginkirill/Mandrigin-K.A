# -*- coding: utf-8 -*-0
def x():
    r=int(input("введите число:"))
    t=int(input("введите еще одно число:"))
    y=0
    max=0
    if r==0 or t==0:
        print("ничего не найдено")
    else:
        while r!=0:
            if r==t:
                y=y+1
            r=t
            t=int(input("введите следующее число:"))
            if max<y:
                max=y
        print(max+1)
    return "Конец"
print (x())
        