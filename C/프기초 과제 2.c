
//복리 이자 계산
#include <stdio.h>

int main(void)
{
	int i, years;
	double total, rate, investment;

	printf("원금: ");
	scanf("%lf", &investment);
	printf("이율(%%): ");
	scanf("%lf", &rate);
	printf("기간(년): ");
	scanf("%d", &years);

	printf("==================\n");
	printf("연도 원리금\n");
	printf("==================\n");
	total = investment;
	rate /= 100.0;
	for (i = 0; i < years; i++)
	{
		total = total * (1 + rate);
		printf("%2d	%10.1f\n", i + 1, total);
	}
	return 0;
}
 

//달력 출력
#include <stdio.h>

#define START_DAY	3
#define DAYS_OF_MONTH	31

int main(void)
{
	int day, date;

	printf("=====================\n");
	printf("일 월 화 수 목 금 토 \n");
	printf("=====================\n");

	for (day = 0; day < START_DAY; day++)
		printf("   ");
	for (date = 1; date <= DAYS_OF_MONTH; date++)
	{
		if (day == 7)
		{
			day = 0;
			printf("\n");
		}
		day++;
		printf("%2d ", date);
	}
	printf("\n=====================\n");

	return 0;
} 



//정수의 제곱을 계산하는 함수 예제
#include <stdio.h>

int square(int n);

int main(void)
{
	int result;

	result = square(5);
	printf("%d\n", result);
	return 0;
}

int square(int n)
{
	return (n*n);
} 

//두수 중에서 큰 수를 찾는 함수 예제
#include <stdio.h>
int get_max(int x, int y);

int main(void)
{
	int a, b;

	printf("두 개의 정수를 입력하시오: ");
	scanf("%d %d", &a, &b);
	printf("두수 중에서 큰 수는 %d입니다. \n", get_max(a, b));
	return 0;
}

int get_max(int x, int y)
{
	if (x > y) return (x);
	else return(y);
}
 

//거듭 제곱 값을 구하는 예제
#include <stdio.h>

int get_integer(void);
int power(int x, int y);

int main(void)
{
	int a, b;

	a = get_integer();
	b = get_integer();

	printf("%d의 %d승은 %d입니다. \n", a, b, power(a, b));
	return 0;
}
//사용자로부터 값을 입력받아서 반환
int get_integer(void)
{
	int n;

	printf("정수를 입력하시오: ");
	scanf("%d", &n);

	return n;
}
//거듭 제곱 값을 계산하여서 반환
int power(int x, int y)
{
	int i;
	long result = 1;

	for (i = 0; i < y; i++)
		result *= x;

	return result;
} 

//수학적인 조합 값을 구하는 예제
#include <stdio.h>

int get_integer(void);
int combination(int n, int r);
long factorial(int n);

int main(void)
{
	int a, b;

	a = get_integer();
	b = get_integer();

	printf("C(%d, %d) = %d \n", a, b, combination(a, b));
	return 0;
}
//팩토리얼 값을 이용하여서 조합값을 계산
int combination(int n, int r)
{
	return (factorial(n) / (factorial(r)*factorial(n - r)));
}
//사용자로부터 값을 입력받아서 반환
int get_integer(void)
{
	int n;

	printf("정수를 입력하시오: ");
	scanf("%d", &n);

	return n;
}
//팩토리얼 값을 변환
long factorial(int n)
{
	int i;
	long result = 1;

	for (i = 1; i <= n; i++)
		result *= i;

	return result;
}
 

//소수 찾기
#include <stdio.h>

int is_prime(int);
int get_integer(void);

main()
{
	int n, result;

	n = get_integer();
	result = is_prime(n);

	if (result == 1)
		printf("%d은 소수입니다. \n", n);
	else
		printf("%d은 소수가 아닙니다. \n", n);
	return 0;
}
int get_integer(void)
{
	int n;

	printf("정수를 입력하시오: ");
	scanf("%d", &n);
	return n;
}
int is_prime(int n)
{
	int divisors = 0, i;
	for (i = 1; i <= n; i++)
	{
		if (n % i == 0)
			divisors++;
	}
	return (divisors == 2);
} 

//짝수 홀수, 절대값, 음수,양수, 0 판단 함수
#include <stdio.h>

int even(int n);
int absolute(int n);
int sign(int n);

int main(void)
{
	int n; 
	printf("정수를 입력하시오: ");
	scanf("%d", &n);
	

	printf("even()의 결과:");
	if (even(n) == 1)
		printf("짝수");
	else
		printf("홀수");

	printf("\nabsolute()의 결과: %d", absolute(n));

	printf("\nsign()의 결과:");
	
	if (sign(n) == -1)
		printf("음수\n");
	else if
		(sign(n) == 1)
		printf("양수\n");
	else
		printf("0");
}
int even(int n)
{
	if (n % 2 == 0)
		return (1);
	else
		return (0);
}
int absolute(int n)
{
	if (n < 0)
	{
		n = -n;
		return n;
	}
	else
		return n;
}
int sign(int n)
{
	if (n < 0)
		return -1;
	else if (n > 0)
		return 1;
	else
		return 0;
}
 

//화씨 온도를 섭씨 온도로 변환하는 프로그램
#include <stdio.h>
double f_to_c(double f);



int main(void)
{
	double f;
	printf("화씨 온도를 입력하시오:");
	scanf("%lf", &f);
	printf("섭씨 온도는 %f도입니다.\n", f_to_c(f));
}
double f_to_c(double f)
{
	double c;
	c= 5.0 / 9.0*(f- 32.0);
	return c;
}
 

//원의 면적을 구하는 프로그램
#include <stdio.h>
#define number 3.141592
double cal_area(double radius);


int main(void)
{
	double radius;
	printf("원의 반지름을 입력하시오:");
	scanf("%lf", &radius);
	printf("원의 면적은 %f입니다\n", cal_area(radius));
}

double cal_area(double radius)
{
	double area;
	area = radius*radius*number;
	return area;
}
 

//세금을 계산하는 프로그램
#include <stdio.h>
int get_tax(int income);

int main(void)
{
	int income;
	printf("소득을 입력하시오(만원):");
	scanf("%d", &income);
	printf("소득세는 %d만원입니다.\n", get_tax(income));
}
int get_tax(int income)
{
	if (income <= 1000)
	{
		income = income*0.08;
		return income;
	}
	else
	{
		income = income*0.1;
		return income;
	}
}
 

//1년이 몇 일인지를 출력하는 프로그램
#include <stdio.h>
int is_leap(int year);

int main(void)
{
	int year;
	printf("연도를 입력하시오:");
	scanf("%d", &year);
	printf("%d년은 %d일입니다.", year, is_leap(year));
}
int is_leap(int year)
{
	if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		return 366;
	else
		return 365;
}
 
//반올림 프로그램
#include <stdio.h>
double round(double f);

int main(void)
{
	double f;
	printf("실수를 입력하시오:");
	scanf("%lf", &f);
	printf("반올림한 값은 %f입니다.\n", round(f));
}
double round(double f)
{
	f = (int)(f + 0.5);
	return f;
}
 


