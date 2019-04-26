#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <time.h>


int main() {
	int trial = 1; // �õ� Ƚ��
	int first = 1; // range�� ����
	int last = 50; // range�� �� 
	int guessN;
	int computerN;

	srand(time(NULL)); //������ random seed ����
	computerN = rand() % 50 + 1;
	printf("The number is %d\n\n", computerN);

	while (1) {
		
		printf("[%d-try] Guess number? (%d..%d) ", trial, first, last);
		scanf("%d", &guessN);
		
		if (guessN == computerN) {
			printf("Correct answer!");
			break;
		}
		
		if (trial == 5) {
			printf("You gave up! The number is %d", computerN);
			break;
		}
		else if (guessN > computerN) {
			printf("The number is smaller than %d\n", guessN);
			last = guessN - 1;
		}
		else {
			printf("The number is larger than %d\n", guessN);
			first = guessN + 1;
		}

		trial++;
	}
	
}

