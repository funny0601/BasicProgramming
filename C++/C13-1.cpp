#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cstring>

using namespace std;

template <typename T>
T getFirst(T a[]) {
	return a[0];
}

void main() {
	int A[5] = { 5, 2, 6, 3, 4 };
	cout << getFirst(A) << endl;

	char B[5] = { 'c', 'a', 'x', 'd', 'z' };
	cout << getFirst(B) << endl;

	double  C[5] = { 2.4, 5.7, 4.8, 7.2, 9.9 };
	cout << getFirst(C) << endl;

}