# -*- coding: cp949 -*- 
###1번
def Reverse_Order(user):
    user_list=[] #튜블을 역순으로 저장할 리스트 생성
    print("User's List:")
    for i in range(0,len(user)): #튜플 길이 만큼
        user_list.insert(0,user[i]) #튜플의 값을 항상 리스트의 맨 앞에 저장한다
                                    #결국 리스트의 값은 튜플 순서의 정반대일 예정
        print(user[i]) #순서대로 값 출력 및 확인
    print(" ")
    print('Sentinel Value: 0')
    print(" ")
    #print(user_list)
    print("Reverse of User's list:")
    for i in range(0,len(user_list)): #반대로 저장된 리스트 길이만큼
        print(user_list[i]) #출력 및 확인
    return   

user = (16, 345, 56, 3457, 236, 354, 75, 634, 2, 23, 6537, 4576, 4, 3)

Reverse_Order(user)