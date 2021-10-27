# -*- coding: utf-8 -*-
name=input("введите имя:")
if name =="Иван" or name == "иван" or name =="ivan" or name =="Ivan":
    print("вы не приняты")
else:
    age=int(input("введите число:")) 
    a=16-age
    if age <0 or age>75:
        print("недопустимый возраст")
    if age >= 16:
        print("Поздравляем вы поступили в ВГУИТ")
    if age <16:
        print("Сначала нужно окончить школу!Тебе осталось учится", a)
