package tutoring;

import java.util.Scanner;

public class Prob1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dollar=0;
		int won = 0;

		final int ������ = 50000;
		final int ���� = 10000;
		final int õ�� = 1000;
		final int ��� = 100;
		final int ���ʿ� = 50;
		final int �ʿ� = 10;
		final int �Ͽ� = 1;
		
		boolean choice=true;
		
		int money[] = {������, ����, õ��, ���, ���ʿ�, �ʿ�, �Ͽ�};
		
		int res=0;
		
		System.out.print("�ݾ��� �Է��Ͻÿ�(�޷��� �Է�)>>");
		dollar = sc.nextInt(); // �ݾ��� �޷��� �Է¹���
		won = dollar *1100; // ��ȭ ���
		//System.out.println(won);
		System.out.print("5�������� ������ ���θ� ���ÿ�(���� ��� yes, ���� ���� ��� no)>>");
		
		if(sc.next().equals("no")) {
			choice = !choice;
			//System.out.println(choice);
		}
		
		for(int i=0; i<money.length; i++) {
			if(!choice) {
				choice = !choice; // 5������ ��ȯ�� ���� �ʴ� ���
				continue;		  // for loop �� ���� ��� 
			}
				res = won/money[i];
				won = won%money[i];
				
				if(res>0)
					System.out.println(money[i]+"�� "+ res + "��");		
		}	
			
		sc.close();
	}

}
