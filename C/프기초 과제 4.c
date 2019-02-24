#include <stdio.h>
#define SIZE 10

int main(void)
{
	char ans1;
	int ans2,  i;
	int seats[SIZE] = {  0 };

	while (1)
	{
		printf("좌석을 예약하시겠습니까? (y 또는 n) ");
		scanf(" %c", &ans1);
		if (ans1 == 'y')
		{
			printf("-------------------------------\n");
			printf("  1  2  3  4  5  6  7  8  9  10\n");
			printf("-------------------------------\n");

			for (i = 0; i < SIZE; i++)
				printf("  %d", seats[i]);
			printf("\n");

			printf("몇번째 좌석을 예약하시겠습니까? ");
			scanf("%d", &ans2);
			if (ans2  <= 0 || ans2> SIZE){
				printf("1부터 10사이의 숫자를 입력하세요\n");
				continue;
			}
			if (seats[ans2 - 1] == 0 )
			{
				seats[ans2 - 1] = 1;
				printf("예약되었습니다.\n");

			}
			else
				printf("이미 예약된 자리입니다. 다른 좌석을 선택하세요. \n");

		}
		else if (ans1 == 'n')
			return 0;

	}
	return 0;
}

#include <stdio.h>
#define SIZE 11

int main(void)
{
	int freq[SIZE] = { 0 };
	int i, candidate;

	while (1)
	{
		printf("몇번 후보자를 선택하시겠습니까?(종료-1): ");
		scanf("%d", &candidate);
		if (candidate < 0) break;
		freq[candidate]++;
	}

	printf("값 득표결과\n");

	for (i = 1; i < SIZE; i++)
		printf("%3d	%3d \n", i, freq[i]);

	return 0;
}

#include <stdio.h>
#define SIZE 10

int main(void)
{
	char ans1;
	int ans2, ans3, i;
	int seats[SIZE] = { 0, 0, 0 };

	while (1)
	{
		printf("좌석을 예약하시겠습니까? (y 또는 n) ");
		scanf(" %c", &ans1);
		if (ans1 == 'y')
		{
			printf("-------------------------------\n");
			printf("  1  2  3  4  5  6  7  8  9  10\n");
			printf("-------------------------------\n");

			for (i = 0; i < SIZE; i++)
				printf("  %d", seats[i]);
			printf("\n");

			printf("몇번째 좌석을 예약하시겠습니까? (좌석 2개를 골라주세요.)");
			scanf("%d,%d", &ans2, &ans3);
			if ((ans2 || ans3) <= 0 || (ans2 || ans3) > SIZE){
				printf("1부터 10사이의 숫자를 입력하세요\n");
				continue;
			}
			if (seats[ans2 - 1] == 0 && seats[ans3 - 1] == 0)
			{
				seats[ans2 - 1] = 1;
				seats[ans3 - 1] = 1;
				printf("모든 좌석이 예약되었습니다.\n");

			}
			else
				printf("이미 예약된 자리입니다. 다른 좌석을 선택하세요. \n");

		}
		else if (ans1 == 'n')
			return 0;

	}
	return 0;
}

#include <stdio.h>
#define SIZE 10

int main(void)
{
	int freq[SIZE+1] = { 0 };
	int i, candidate;

	while (1)
	{
		printf("몇번 후보자를 선택하시겠습니까?(종료-1): ");
		scanf("%d", &candidate);
		if (candidate < 0) break;
		freq[candidate]++;
	}

	printf("값 득표결과\n");

	for (i = 0; i < 10; i++)
		printf("%3d	%3d \n", i+1, freq[i+1]);

	return 0;
}



//매달 요일 얼마까지 있는 지 표시하는 프로그램
#include <stdio.h>

int main(void)
{
	int days[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int i;
	for (i = 0; i < 12; i++)
		printf("%d월은 %d일까지 있습니다.\n", i + 1, days[i]);
	return 0;
}


//최대값과 최소값을 출력하는 프로그램
#include <stdio.h>
#include <stdlib.h>
int main(void)
{
	int value[10];
	int i, MAX, MIN;

	
	for (i = 0; i < 10; i++){
		value[i] = rand() % 10;
	}	
	MAX = value[0];
	MIN = value[0];
	for (i = 1; i < 10; i++)
		MAX = (MAX > value[i]) ? MAX : value[i];
	printf("최대값: %d\n", MAX);
	for (int j = 1; j < 10; j++){
		MIN = (MIN > value[j]) ? value[j] : MIN;
	}
		printf("최소값: %d ", MIN);
	
	return 0;
}


