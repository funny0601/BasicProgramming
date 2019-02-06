/*
 * Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라.
 * $1=1100원으로 가정하고 계산하라.
 */

package ch02;

import java.util.Scanner;

public class practice01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int korMoney = s.nextInt();
		double dollar = korMoney / 1100;
		System.out.println(korMoney + "원은 $" + dollar + "입니다.");
		s.close();
	}
}
