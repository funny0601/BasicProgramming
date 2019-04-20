#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cstring>

using namespace std;

template <typename T>
void copyArray(T a[], T b[], int n) {
	for (int i = 0; i < n; i++) {
		b[i] = a[i];
	}
}//�ϳ��� �迭�� �ٸ� �迭�� �����ϴ� �Լ��� ���ø����� ����


template <typename T>
void showArray(T a[], int n) {
	for (int i = 0; i < n; i++) {
		cout << a[i] << " ";
	}
	cout << "" << endl;
} //�迭�� ����ϴ� �Լ��� ���ø����� ����

void main() {
	
	int intA[5] = { 1, 2, 3, 4, 5 };
	int intB[5] = { 0 };
	int ARRAY_SIZE = (sizeof(intA) / sizeof(intA[0]));
	//�迭 ���̸� ���ϱ� ���� sizeof �Լ� ���

	cout << "�迭 ���� ��" << endl;
	cout << "intA ���:: "; showArray(intA, ARRAY_SIZE);
	cout << "intB ���:: "; showArray(intB, ARRAY_SIZE);

	copyArray(intA, intB, ARRAY_SIZE);

	cout << "�迭 ���� ��" << endl;
	cout << "intA ���:: "; showArray(intA, ARRAY_SIZE);
	cout << "intB ���:: "; showArray(intB, ARRAY_SIZE);
	cout << "" << endl;

	char charA[5] = { 'A', 'B', 'C', 'D', 'E' };
	char charB[5] = { 'a', 'b', 'c', 'd', 'e' };
	ARRAY_SIZE = (sizeof(charA) / sizeof(charA[0]));
	//�迭 ���̸� ���ϱ� ���� sizeof �Լ� ���

	cout << "�迭 ���� ��" << endl;
	cout << "charA ���:: "; showArray(charA, ARRAY_SIZE);
	cout << "charB ���:: "; showArray(charB, ARRAY_SIZE);

	copyArray(charA, charB, ARRAY_SIZE);

	cout << "�迭 ���� ��" << endl;
	cout << "charA ���:: "; showArray(charA, ARRAY_SIZE);
	cout << "charB ���:: "; showArray(charB, ARRAY_SIZE);
	cout << "" << endl;

	double doubleA[5] = {1.9, 2.8, 3.7, 4.6, 5.5};
	double doubleB[5] = { 0.9, 1.1, 2.2, 3.3, 4.4};
	ARRAY_SIZE = (sizeof(doubleA) / sizeof(doubleA[0]));
	//�迭 ���̸� ���ϱ� ���� sizeof �Լ� ���

	cout << "�迭 ���� ��" << endl;
	cout << "doubleA ���:: "; showArray(doubleA, ARRAY_SIZE);
	cout << "doubleB ���:: "; showArray(doubleB, ARRAY_SIZE);

	copyArray(doubleA, doubleB, ARRAY_SIZE);

	cout << "�迭 ���� ��" << endl;
	cout << "doubleA ���:: "; showArray(doubleA, ARRAY_SIZE);
	cout << "doubleB ���:: "; showArray(doubleB, ARRAY_SIZE);
	cout << "" << endl;

}