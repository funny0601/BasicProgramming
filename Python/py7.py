# -*- coding: cp949 -*- 
###7��
def Anagrams(a,b):
    a_list=list(a) #����Ʈ�� string �ϳ��� ����
    a_list.sort() #�������
    #print(a_list)
    b_list=list(b) #����Ʈ�� ����
    b_list.sort() #�������
    #print(b_list)
    return print(a_list == b_list) #boolean���� ���
    
Anagrams('korea', 'ersoka')
Anagrams('evil', 'live')
Anagrams('samsung', 'apple')
Anagrams('Apple', 'apple')
Anagrams('maybe','ybeam')