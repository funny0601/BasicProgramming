# -*- coding: cp949 -*- 
###7번
def Anagrams(a,b):
    a_list=list(a) #리스트에 string 하나씩 저장
    a_list.sort() #순서대로
    #print(a_list)
    b_list=list(b) #리스트에 저장
    b_list.sort() #순서대로
    #print(b_list)
    return print(a_list == b_list) #boolean값을 출력
    
Anagrams('korea', 'ersoka')
Anagrams('evil', 'live')
Anagrams('samsung', 'apple')
Anagrams('Apple', 'apple')
Anagrams('maybe','ybeam')