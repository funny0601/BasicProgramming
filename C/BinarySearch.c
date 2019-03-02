#include <stdio.h>

/*
 * 순차 탐색 알고리즘과
 * 이진 탐색 알고리즘의 비교를 위한
 * 비교연산 횟수 counting 추가
 */ 

int BSearch(int ar[], int len, int target){
    int first =0;
    int last =len-1;
    int mid;
    int opCount=0; //비교연산의 횟수 기록

    while(first<=last){

        mid = (first+last)/2;

        if(target ==ar[mid]){
            return mid;
        }
        else
        {
            if(target <ar[mid])
                last=mid-1;
            else
                first = mid+1;
        }
        opCount +=1;
    }
    printf("비교연산횟수: %d \n", opCOunt);
    return -1;
}

int main(void){
    int arr1[500] = {0,}; //모든 요소 0으로 초기화
    int arr2[5000] = {0,}; //모든 요소 0으로 초기화
    int arr3[50000] = {0,}; //모든 요소 0으로 초기화

    int idx;

    idx = BSearch(arr1, sizeof(arr)/sizeof(int), 1);
    if(idx ==-1) printf("탐색 실패\n");
    else printf("타겟 저장 인덱스: %d \n", idx);

    idx = BSearch(arr2, sizeof(arr)/sizeof(int), 2);
    if(idx ==-1) printf("탐색 실패\n");
    else printf("타겟 저장 인덱스: %d \n", idx);

    idx = BSearch(arr3, sizeof(arr)/sizeof(int), 3);
    if(idx ==-1) printf("탐색 실패\n");
    else printf("타겟 저장 인덱스: %d \n", idx);

    return 0;
}