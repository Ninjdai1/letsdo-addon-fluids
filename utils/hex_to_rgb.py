#!/bin/python

while(True):
    c = input("Fluid Color (HEX): ")
    color = tuple(int(c.upper().replace("#", "")[i:i+2], 16) for i in (0, 2, 4))
    print(color)
