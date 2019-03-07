# input을 사용하여 사용자의 이름을 입력받고 
# 환영하는 프로그램을 작성하세요.
name = input("Enter your name: ")
print('Hello ', name)

# 급여를 지불하기 위해서 
# 사용자로부터 근로시간과 시간당 임금을 계산하는 프로그램을 작성하세요.
hours = int(input("Enter Hours: "))
rate = float(input('Enter Rate: '))
print('Pay: ', hours*rate)

# 자판기에 돈을 입력하고, 음료를 고르면, 거스름돈을 출력하시오. 
while 1:
  
  money = int(input('돈을 넣어주세요: '))
  drink = int(input('음료를 골라주세요(1 콜라:100원, 2 사이다:150원, 3 오렌지주스:200원) :'))  
  
  if drink==1:
    money = money -100
    print('콜라를 선택하셨습니다. 거스름돈은 ', money, '원 입니다.')
    if money <=0:
      break
      
  elif drink==2:
    money = money -150
    print('사이다를 선택하셨습니다. 거스름돈은 ', money, '원 입니다.')
    if money <=0:
      break
      
  elif drink==3:
    money = money -200
    print('오렌지주스를 선택하셨습니다. 거스름돈은 ', money, '원 입니다.')
    if money <=0:
      break
      
  else:
    print('없는 번호입니다. 다시 입력해주세요')