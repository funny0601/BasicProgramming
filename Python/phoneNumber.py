phoneList = []
numOfData = 0
def InputData(name, number):
    phoneList.append({"name":name, "number":number})
    global numOfData
    numOfData += 1

def ShowData(data):
    print("-------------------")
    print("이름 :", data["name"])
    print("번호 :", data["number"])
    print("-------------------")

def SearchData(name):
    for i in phoneList:
        if i.get("name") == name:
            ShowData(i)
            return
    print("찾는 이름이 없습니다.")
    return

def DeleteData(name):
    remove = -1
    for i in range(numOfData):
        if phoneList[i].get("name") == name:
            remove = i
            break
    if remove == -1:
        print("찾는 이름이 없습니다.")
    else:
        del phoneList[remove]
        numOfData -= 1

    return

while True:
    print("=============")
    print("현재 데이터 개수 : {}개".format(numOfData))
    print("1. 전화번호 추가")
    print("2. 전화번호 검색")
    print("3. 전화번호 삭제")
    print("4. 전화번호 전체출력")
    print("5. 종료")
    print("=============")
    menu = int(input("선택 >> "))
    if menu ==1:
        name = input("이름 입력:")
        number = input("번호 입력:")
        InputData(name, number)
    elif menu ==2:
        search_name=input("검색할 이름:")
        SearchData(search_name)
    elif menu ==3:
        delete_name = input("삭제할 이름:")
        DeleteData(delete_name)
    elif menu==4:
        for i in phoneList:
            ShowData(i)
    elif menu==5:
        print("종료하겠습니다.")
        break
    else:
        print("올바른 선택이 아닙니다.")