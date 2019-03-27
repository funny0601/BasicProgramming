package tutoring;

import java.util.Scanner;

public class Prob1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나를 입력하세요>>");
		String s = sc.next();
		char c = s.charAt(0);
		
		// 소문자일 경우
		if(c>='a'&&c<='z') {
			for(char i=c; i>='a'; i--) {
				for(char j='a'; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println("");
			}
		}
		// 소문자가 아닌 경우
		else {
			int i = (int)(Math.random()*10+1); //Math.random()은 0부터 1 사이의 값
			//System.out.println(i);
			for(int j =0; j<i; j++) {
				System.out.print(c);
			}
		}
		sc.close();
	}

}
