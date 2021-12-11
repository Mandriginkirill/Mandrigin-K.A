# -*- coding: utf-8 -*-
def x():
    a=input("введите строку с f:")
    if a.count("f")== 1:
        print(a.find("f"))
    else:
        a.count("f")>=2
    print(a.find("f"),a.rfind("f"))
    return "Конец"
print(x())