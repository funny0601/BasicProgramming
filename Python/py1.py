# -*- coding: cp949 -*- 
###1��
def Reverse_Order(user):
    user_list=[] #Ʃ���� �������� ������ ����Ʈ ����
    print("User's List:")
    for i in range(0,len(user)): #Ʃ�� ���� ��ŭ
        user_list.insert(0,user[i]) #Ʃ���� ���� �׻� ����Ʈ�� �� �տ� �����Ѵ�
                                    #�ᱹ ����Ʈ�� ���� Ʃ�� ������ ���ݴ��� ����
        print(user[i]) #������� �� ��� �� Ȯ��
    print(" ")
    print('Sentinel Value: 0')
    print(" ")
    #print(user_list)
    print("Reverse of User's list:")
    for i in range(0,len(user_list)): #�ݴ�� ����� ����Ʈ ���̸�ŭ
        print(user_list[i]) #��� �� Ȯ��
    return   

user = (16, 345, 56, 3457, 236, 354, 75, 634, 2, 23, 6537, 4576, 4, 3)

Reverse_Order(user)