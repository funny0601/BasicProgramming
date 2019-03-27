package tutoring;

import java.util.Scanner;

public class Prob1_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x1, x2;
		char op;
		
		while(true) {
			System.out.print("����>>");
			x1 = sc.nextInt();
			op = sc.next().charAt(0);
			x2 = sc.nextInt();
			
			if(op=='!') {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				break;
			}
			
			switch(op) {
				case '+':
					System.out.println(x1+"+"+x2+"�� ��� ����� "+(x1+x2));
					break;
				case '-':
					System.out.println(x1+"-"+x2+"�� ��� ����� "+(x1-x2));
					break;
				case '*':
					System.out.println(x1+"*"+x2+"�� ��� ����� "+(x1*x2));
					break;
				case '/':
					if(x2==0) {
						System.out.println("0���� ���� �� �����ϴ�.");
						break;
					}
					System.out.println(x1+"/"+x2+"�� ��� ����� "+(x1/x2));
					break;
				default:
					System.out.println("Wrong Operator!");
					break;
			}
			
			// if(op.equals('!') // equals�� ���ڿ��� �ٷ�� �Լ��� char���� �������� ����
			
			/*
			if(sc.next().charAt(0)=='!') {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				break;
			}
			else
				op = sc.next().charAt(0);
			*/

		}
		
		sc.close();
	}

}
