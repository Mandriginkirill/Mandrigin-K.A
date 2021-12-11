# -*- coding: utf-8 -*-
def x():
    t = int(input("введите число больше 2: "))
    p = 1
    if t<=2:
        print ("введите другое число")
    else:
        while p <= t:
            p = p + 1
            if t % p == 0:
                print(p)
                break
    return "Конец"
print (x())