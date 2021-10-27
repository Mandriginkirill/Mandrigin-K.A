# -*- coding: utf-8 -*-
second=int(input("введите число:"))
sec=second%60
min=second // 60 % 60
hours=second // 60 // 60 % 24
day=second // 86400
print(day, ":", hours, ":",min,":",sec )