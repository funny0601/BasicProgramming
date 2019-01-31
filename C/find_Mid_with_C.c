#include <stdio.h>
void findMid(void);

int main(void){

    findMid();
}

void findMid(void){
    printf("숫자를 입력하시오: ");
    int a, b, c=0;
    scanf("%d %d %d", &a, &b, &c);
    int temp=0;
    
    int num[]={a, b, c};
    
    for (int i=0; i<3; i++) {
        for(int j=0; j<3; j++) {
            if(num[i]>=num[j])
                continue;
            else
                temp=num[i];
            num[i]=num[j];
            num[j]=temp;
        }
    }
    for(int k=0; k<3; k++)
        printf("%d ", num[k]);
    printf("중간 값: %d ", num[1]);

