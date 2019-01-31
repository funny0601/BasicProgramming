#include <stdio.h>
#include <string.h>

int decision(char* c);

int main(void){
    char word[100];
    scanf("%s", word);
    decision(word);
}

int decision(char* c){
    for(int i=0; i<strlen(c); i++){
        if(c[i]!=c[strlen(c)-1-i]){
            printf("회문이 아닙니다.");
            return 0;
        }
    }
    printf("회문입니다.");
    return 0;
}
