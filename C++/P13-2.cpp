#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cstring>

using namespace std;

template <typename T>
void copyArray(T a[], T b[], int n) {
	for (int i = 0; i < n; i++) {
		b[i] = a[i];
	}
}//하나의 배열을 다른 배열로 복사하는 함수를 템플릿으로 정의


template <typename T>
void showArray(T a[], int n) {
	for (int i = 0; i < n; i++) {
		cout << a[i] << " ";
	}
	cout << "" << endl;
} //배열을 출력하는 함수를 템플릿으로 정의

void main() {
	
	int intA[5] = { 1, 2, 3, 4, 5 };
	int intB[5] = { 0 };
	int ARRAY_SIZE = (sizeof(intA) / sizeof(intA[0]));
	//배열 길이를 구하기 위해 sizeof 함수 사용

	cout << "배열 복사 전" << endl;
	cout << "intA 출력:: "; showArray(intA, ARRAY_SIZE);
	cout << "intB 출력:: "; showArray(intB, ARRAY_SIZE);

	copyArray(intA, intB, ARRAY_SIZE);

	cout << "배열 복사 후" << endl;
	cout << "intA 출력:: "; showArray(intA, ARRAY_SIZE);
	cout << "intB 출력:: "; showArray(intB, ARRAY_SIZE);
	cout << "" << endl;

	char charA[5] = { 'A', 'B', 'C', 'D', 'E' };
	char charB[5] = { 'a', 'b', 'c', 'd', 'e' };
	ARRAY_SIZE = (sizeof(charA) / sizeof(charA[0]));
	//배열 길이를 구하기 위해 sizeof 함수 사용

	cout << "배열 복사 전" << endl;
	cout << "charA 출력:: "; showArray(charA, ARRAY_SIZE);
	cout << "charB 출력:: "; showArray(charB, ARRAY_SIZE);

	copyArray(charA, charB, ARRAY_SIZE);

	cout << "배열 복사 후" << endl;
	cout << "charA 출력:: "; showArray(charA, ARRAY_SIZE);
	cout << "charB 출력:: "; showArray(charB, ARRAY_SIZE);
	cout << "" << endl;

	double doubleA[5] = {1.9, 2.8, 3.7, 4.6, 5.5};
	double doubleB[5] = { 0.9, 1.1, 2.2, 3.3, 4.4};
	ARRAY_SIZE = (sizeof(doubleA) / sizeof(doubleA[0]));
	//배열 길이를 구하기 위해 sizeof 함수 사용

	cout << "배열 복사 전" << endl;
	cout << "doubleA 출력:: "; showArray(doubleA, ARRAY_SIZE);
	cout << "doubleB 출력:: "; showArray(doubleB, ARRAY_SIZE);

	copyArray(doubleA, doubleB, ARRAY_SIZE);

	cout << "배열 복사 후" << endl;
	cout << "doubleA 출력:: "; showArray(doubleA, ARRAY_SIZE);
	cout << "doubleB 출력:: "; showArray(doubleB, ARRAY_SIZE);
	cout << "" << endl;

}