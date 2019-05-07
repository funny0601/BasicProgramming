#define _CRT_SECURE_NO_WARNINGS 

#include <stdio.h>
#include  <stdlib.h>

void makeCalendar(int, int, int);

int isLeafYear(int year)
{
	return(year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
}
int getDaysOfYear(int year)
{
	return (isLeafYear(year)) ? 366 : 365;
}
int getDaysOfMonth(int year, int month)
{
	switch (month) {
	case 2: return (isLeafYear(year)) ? 29 : 28;
	case 4: case 6: case 9: case 11: return 30;
	default: return 31;  //1, 3, 5, 7, 8, 10, 12
	}
}
int getDays(int year, int month)
{
	int days = 0;

	for (int y = 1; y < year; y++)
		days += getDaysOfYear(y);

	for (int m = 1; m < month; m++)
		days += getDaysOfMonth(year, m);

	return days+1;
}

void makeCalendar(int year, int month, int weekDay) {
	
	int daysOfMonth = getDaysOfMonth(year, month);
	int date = 1;
	int week_count = 0; 

	printf("--------------------\n");
	printf("      %d %d    \n", year, month);
	printf("--------------------\n");
	printf("Su Mo Tu We Th Fi Sa\n");

	
	for (int i = 0; i < 7; i++) {
		if (weekDay > i) {
			printf("   ");
			continue;
		}
		printf("%2d ", date);
		date += 1;
	}
	printf("\n");
	
	for (date; date < daysOfMonth + 1; date++) {
		printf("%2d ", date);
		week_count += 1;
		
		if(week_count%7==0)
			printf("\n");
	}

	if (week_count % 7 == 0) {
		printf("--------------------\n");
	}
	else {
		for (int i = 0; i < 7 - week_count % 7; i++) {
			printf("  ");
		}
		printf("\n--------------------\n");
	}

}

int main()
{
	int year, month, days, weekDay;
	
	while (1) {
		printf("Enter date (yyyy mm dd): ");
		scanf("%d", &year);
		if (year == 0) {
			printf("Bye!\n");
			break;
		}
		scanf("%d", &month);
		days = getDays(year, month);

		weekDay = days % 7;
		//printf("%d", weekDay);
		//printf("%d-%d-%d is %d-th day and ", year, month,  days);
		
		makeCalendar(year, month, weekDay);
	}
}