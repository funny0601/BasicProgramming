package tutoring;

import java.util.Scanner;

public class Prob1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dollar=0;
		int won = 0;

		final int 오만원 = 50000;
		final int 만원 = 10000;
		final int 천원 = 1000;
		final int 백원 = 100;
		final int 오십원 = 50;
		final int 십원 = 10;
		final int 일원 = 1;
		
		boolean choice=true;
		
		int money[] = {오만원, 만원, 천원, 백원, 오십원, 십원, 일원};
		
		int res=0;
		
		System.out.print("금액을 입력하시오(달러로 입력)>>");
		dollar = sc.nextInt(); // 금액을 달러로 입력받음
		won = dollar *1100; // 한화 계산
		//System.out.println(won);
		System.out.print("5만원권을 받을지 여부를 고르시오(받을 경우 yes, 받지 않을 경우 no)>>");
		
		if(sc.next().equals("no")) {
			choice = !choice;
			//System.out.println(choice);
		}
		
		for(int i=0; i<money.length; i++) {
			if(!choice) {
				choice = !choice; // 5만원권 교환을 하지 않는 경우
				continue;		  // for loop 한 차례 통과 
			}
				res = won/money[i];
				won = won%money[i];
				
				if(res>0)
					System.out.println(money[i]+"권 "+ res + "매");		
		}	
			
		sc.close();
	}

}
