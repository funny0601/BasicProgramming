/*
 * Scanner Ŭ������ �̿��Ͽ� ��ȭ�� �Է¹޾� �޷��� �ٲپ� ���� ���ÿ� ���� ����ϴ� ���α׷��� �ۼ��϶�.
 * $1=1100������ �����ϰ� ����϶�.
 */

package ch02;

import java.util.Scanner;

public class practice01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int korMoney = s.nextInt();
		double dollar = korMoney / 1100;
		System.out.println(korMoney + "���� $" + dollar + "�Դϴ�.");
		s.close();
	}
}
