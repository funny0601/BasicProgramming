import sys

print("입력(Input)에 대한 소수 판별을 해드립니다.\n")
inputvalue = int(input("소수 판별하기 위한 N값을 입력해 주세요: "))

for i in range(2, inputvalue):
    if inputvalue % i == 0 and inputvalue != i:
        print("\ninput number -->%5d is Not a Prime number!!\n" % inputvalue)
        sys.exit(1)

if inputvalue > 1:
    print("\ninput number -->%5d is a Prime number!!\n" % inputvalue)
else:
    print("\ninput number -->%5d is Not a Prime number!!\n" % inputvalue)