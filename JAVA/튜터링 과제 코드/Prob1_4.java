package tutoring;

import java.util.Scanner;

public class Prob1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��ϼ���>>");
		String s = sc.next();
		char c = s.charAt(0);
		
		// �ҹ����� ���
		if(c>='a'&&c<='z') {
			for(char i=c; i>='a'; i--) {
				for(char j='a'; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println("");
			}
		}
		// �ҹ��ڰ� �ƴ� ���
		else {
			int i = (int)(Math.random()*10+1); //Math.random()�� 0���� 1 ������ ��
			//System.out.println(i);
			for(int j =0; j<i; j++) {
				System.out.print(c);
			}
		}
		sc.close();
	}

}
