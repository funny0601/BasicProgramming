/*
 * Scanner Ŭ������ �̿��Ͽ� ������ �� ���� �׼��� �Է¹޾� ���� ����, �� ����, õ ����,
 * 500��¥�� ����, 100��¥�� ����, 50��¥�� ����, 10��¥�� ����, 1��¥�� ���� �� �� ���� ��ȯ�Ǵ��� ����϶�.
 */

package ch02;

import java.util.Scanner;

public class practice03 {
	
	final static int ������ = 50000;
	final static int ���� = 10000;
	final static int õ�� = 1000;
	final static int ����� = 500;
	final static int ��� = 100;
	final static int ���ʿ� = 50;
	final static int �ʿ� = 10;
	final static int �Ͽ� = 1;
	
	public static void main(String[] args) {
		int res, money;
		Scanner s = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		money = s.nextInt();
		
		int[] dollar = {������, ����, õ��, �����, ���, ���ʿ�, �ʿ�, �Ͽ�};
		
		for(int i=0; i<dollar.length; i++) {
			res = money/dollar[i];
			money = money%dollar[i];
			
			if(res>0)
				System.out.println(dollar[i]+"�� "+ res + "��");
		}
		
		s.close();
	}

}



