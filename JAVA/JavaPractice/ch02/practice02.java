/*
 * Scanner Ŭ������ �̿��Ͽ� 2�ڸ��� ����(10~99����)�� �Է¹ް�, 
 * ���� �ڸ��� 1�� �ڸ��� ������ �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��϶�
 */

package ch02;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		if (num / 10 == num % 10) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		} else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");

		s.close();
	}

}
