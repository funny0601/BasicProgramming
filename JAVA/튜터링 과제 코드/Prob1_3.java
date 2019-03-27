package tutoring;

import java.util.Scanner;

public class Prob1_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x1, x2;
		char op;
		
		while(true) {
			System.out.print("연산>>");
			x1 = sc.nextInt();
			op = sc.next().charAt(0);
			x2 = sc.nextInt();
			
			if(op=='!') {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}
			
			switch(op) {
				case '+':
					System.out.println(x1+"+"+x2+"의 계산 결과는 "+(x1+x2));
					break;
				case '-':
					System.out.println(x1+"-"+x2+"의 계산 결과는 "+(x1-x2));
					break;
				case '*':
					System.out.println(x1+"*"+x2+"의 계산 결과는 "+(x1*x2));
					break;
				case '/':
					if(x2==0) {
						System.out.println("0으로 나눌 수 없습니다.");
						break;
					}
					System.out.println(x1+"/"+x2+"의 계산 결과는 "+(x1/x2));
					break;
				default:
					System.out.println("Wrong Operator!");
					break;
			}
			
			// if(op.equals('!') // equals는 문자열을 다루는 함수라서 char형은 적합하지 않음
			
			/*
			if(sc.next().charAt(0)=='!') {
				System.out.println("프로그램을 종료합니다.");
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
