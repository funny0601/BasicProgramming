# -*- coding: cp949 -*- 
###3번
def NZP():
    neg = []
    zero = []
    pos = []
    while(True):
        num = input()  # #사용자한테 입력 받음
        
        if (num == " "):  # 입력받은 값이 공백일 경우 반복문 나감
            break
        num=int(num) #숫자비교를 위해 정수형으로 변환
        #print(num)
        
        if (num == 0): #num값이 0이면
            zero.append(num) #zero 리스트에 저장
        elif (num > 0): #0초과일 경우
            pos.append(num) #positive 리스트에 저장
        else: #나머지 경우
            neg.append(num) #negative 리스트에 저장
    #모든 리스트 출력 
    print("Negative_Numbers: ", neg)
    print("Zeros: " , zero)
    print("Positive_Numbers: " , pos)
    return

NZP()