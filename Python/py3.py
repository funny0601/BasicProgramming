# -*- coding: cp949 -*- 
###3��
def NZP():
    neg = []
    zero = []
    pos = []
    while(True):
        num = input()  # #��������� �Է� ����
        
        if (num == " "):  # �Է¹��� ���� ������ ��� �ݺ��� ����
            break
        num=int(num) #���ں񱳸� ���� ���������� ��ȯ
        #print(num)
        
        if (num == 0): #num���� 0�̸�
            zero.append(num) #zero ����Ʈ�� ����
        elif (num > 0): #0�ʰ��� ���
            pos.append(num) #positive ����Ʈ�� ����
        else: #������ ���
            neg.append(num) #negative ����Ʈ�� ����
    #��� ����Ʈ ��� 
    print("Negative_Numbers: ", neg)
    print("Zeros: " , zero)
    print("Positive_Numbers: " , pos)
    return

NZP()