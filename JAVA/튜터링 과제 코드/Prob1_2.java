package tutoring;

import java.util.Scanner;

public class Prob1_2 {

	public static void inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2) {
		if((x>=rectx1&&x<=rectx2)&& (y>=recty1&&x<=recty2)) {
			System.out.println("("+x+","+y+")"+"�� �簢�� �ȿ� �ֽ��ϴ�.");
		}else 
			System.out.println("("+x+","+y+")"+"�� �簢�� �ȿ� �����ϴ�.");
	}
	public static void main(String[] args) {
		int lu_x, lu_y, rd_x, rd_y;
		int x, y;
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ��� �𼭸��� ��ǥ(x, y)�� �Է��Ͻÿ�>>");
		lu_x = sc.nextInt();
		lu_y = sc.nextInt();

		while(true) {
			System.out.print("������ �ϴ� �𼭸��� ��ǥ(x, y)�� �Է��Ͻÿ�>>");
			rd_x = sc.nextInt();
			rd_y = sc.nextInt();
			
			if(!(rd_x<=lu_x || rd_y<=lu_y)) {
				break;
			}
			
			System.out.println("������ �ϴ� �𼭸��� ��ǥ�� ���� ��� �𼭸��� ��ǥ���� Ŀ���մϴ�.");
		}
	
		System.out.print("�� (x, y)�� ��ǥ�� �Է��Ͻÿ�>>");
		x = sc.nextInt();
		y = sc.nextInt();

		inRect(x, y, lu_x, rd_x, lu_y, rd_y);
	
		sc.close();

	}

}
