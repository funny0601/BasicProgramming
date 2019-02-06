/*
 * Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권,
 * 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.
 */

package ch02;

import java.util.Scanner;

public class practice03 {
	
	final static int 오만원 = 50000;
	final static int 만원 = 10000;
	final static int 천원 = 1000;
	final static int 오백원 = 500;
	final static int 백원 = 100;
	final static int 오십원 = 50;
	final static int 십원 = 10;
	final static int 일원 = 1;
	
	public static void main(String[] args) {
		int res, money;
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		money = s.nextInt();
		
		int[] dollar = {오만원, 만원, 천원, 오백원, 백원, 오십원, 십원, 일원};
		
		for(int i=0; i<dollar.length; i++) {
			res = money/dollar[i];
			money = money%dollar[i];
			
			if(res>0)
				System.out.println(dollar[i]+"권 "+ res + "매");
		}
		
		s.close();
	}

}



