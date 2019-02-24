//방사능 물질이 1/10이하로 줄어들 때까지 걸리는 시간 계산
#include <stdio.h>

int main(void)
{
	int halflife;
	double initial;
	double current;
	int years = 0;

	printf("반감기를 입력하시오(년): ");
	scanf("%d", &halflife);

	initial = 100.0;
	current = initial;
	while (current > initial / 10.0)
	{
		years += halflife;
		current = current / 2.0;
		printf("%d년 후에 남은 양=%f\n", years, current);
	}
	printf("1/10 이하로 되기까지 걸린 시간=%d년\n", years);
	return 0;
}
//숫자 추측 프로그램
#include <stdio.h>

int main(void)
{
	int answer = 59;
	int guess;
	int tries = 0;

	do{
		printf("정답을 추측하여 보시오: ");
		scanf("%d", &guess);
		tries++;

		if (guess > answer)
			printf("제시한 정수가 높습니다. \n");
		if (guess < answer)
			printf("제시한 정수가 낮습니다. \n");
	} while (guess != answer);

	printf("축하합니다. 시도횟수=%d\n", tries);
	return 0;
}
//숫자 추측 프로그램
#include <stdio.h>
#include <stdlib.h>


int main(void)
{
	int guess, number;
	int tries = 0;

	srand((unsigned)time(NULL));
	number = rand() % 101;
	do{
		printf("정답을 추측하여 보시오: ");
		scanf("%d", &guess);
		tries++;

		if (guess > number)
			printf("제시한 정수가 높습니다. \n");
		if (guess < number)
			printf("제시한 정수가 낮습니다. \n");
	} while (guess != number);

	printf("축하합니다. 시도횟수=%d\n", tries);
	printf("%d\n", number);
	return 0;
}

//직각 삼각형 찾기

#include <stdio.h>

int main(void)
{
	int x, y, z;

	for (x = 1; x <= 100; x++)
	{
		for (y = 1; y <= 100; y++)
		{
			for (z = 1; z <= 100; z++)
			{
				if ((x*x + y*y) == z*z)
					printf("%d %d %d\n", x, y, z);
			}
		}
	}
	return 0;
}



//1부터 100사이의 모든 3의 배수의 합
#include <stdio.h>

int main(void)
{
	int n;
	int sum = 0;

	for (n = 1; n < 100; n++)
		if (n % 3 == 0)
			sum = sum + n;
	printf("1부터 100사이의 모든 3의 배수의 합은 %d입니다.", sum);

	return 0;
}
//1부터 100까지 3의 배수의 합
#include <stdio.h>

int main(void)
{
	int n = 1;
	int sum = 0;
	
	do
	{
		if (n % 3 == 0)
			sum += n;
		n++;
	} while (n <= 100);


	printf("1부터 100사이의 모든 3의 배수의 합은 %d입니다.", sum);
	return 0;
}


//패턴 출력 프로그램
#include <stdio.h>

int main(void)
{
	int x, y, z;

	for (x = 1; x <= 7; x++)
	{
		for (z = 1; z<=7-x; z++)
			printf(" ");
	
		for (y = 0; y < x; y++)
			printf("*");

		printf("\n");
	}

	return 0;
}

//중첩 for루프를 사용하여 출력

#include <stdio.h>

int main(void)
{
	int x, y, z;
	for (x = 1; x <= 5; x++)
	{
		for (y = 1; y <= 5 - x; y++)
			printf(" ");
		for (z = 1; z <= 2 * x - 1;z++)
			printf("*"); 
		printf("\n");
	}

	for (x = 4; x >= 1; x--)
	{
		for (y = 1; y <= 5-x; y++)
			printf(" ");
		for (z = 1; z <= 2*x-1; z++)
			printf("*");
		printf("\n");
	}

	return 0;
}

