# -*- coding: cp949 -*-
def findMax():
    a = int(input())
    b = int(input())
    c = int(input())

    max_num = 0

    if a > b:
        max_num = a 
    else:
        max_num = b   
    if max_num < c:
        max_num = c 

    return max_num

print(findMax())

def doubleNum():
    a = int(input())
    a = a*2
    print(a)
    return

doubleNum()

def circle():
    r = float(input())
    print("넓이:", r*r*3.14)
    print("둘레:", 2*3.14*r)
    return

circle()


def minNum():
    import random
    list_min=[]
    n=20
    for i in range(0, n):
        list_min.append(random.randint(1,100))
        i=i+1  
    print(list_min)
    
    min_num=list_min[0];
    
    for m in list_min:
        if m<min_num:
            min_num=m
    print(min_num)
    return

        
minNum()

def cal():
    a = int(input())
    b = int(input())
    
    print(a//b, a%b)
    return

cal()

def oddEven():
    a = int(input())
    if a%2==0:
        print("짝수")
    else:
        print("홀수")
    return

oddEven()

def average():
    a = float(input())
    b = float(input())
    c = float(input())
    
    print((a + b + c) / 3)
    return 

average()