package tutoring;

import java.util.Scanner;

public class Prob1_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num_array[] = new int[50];
		int num;
		
		for(int i=0; i<num_array.length; i++) {
			num_array[i]= (int) (Math.random()*301);
		}
		
		System.out.println("�Է¹��� ���� ����� ����ϴ� ���α׷��Դϴ�.");
		System.out.print("���ڸ� �Է��Ͻÿ�>>");
		num = sc.nextInt();
		
		System.out.print(num+"�� ����� ");
		
		for(int i=0; i<num_array.length; i++) {
			if(num_array[i]%num==0)
				System.out.print(num_array[i]+" ");
		}
		
		sc.close();
	}

}
