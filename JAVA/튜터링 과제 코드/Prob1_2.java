package tutoring;

import java.util.Scanner;

public class Prob1_2 {

	public static void inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2) {
		if((x>=rectx1&&x<=rectx2)&& (y>=recty1&&x<=recty2)) {
			System.out.println("("+x+","+y+")"+"는 사각형 안에 있습니다.");
		}else 
			System.out.println("("+x+","+y+")"+"는 사각형 안에 없습니다.");
	}
	public static void main(String[] args) {
		int lu_x, lu_y, rd_x, rd_y;
		int x, y;
		Scanner sc = new Scanner(System.in);

		System.out.print("왼쪽 상단 모서리의 좌표(x, y)를 입력하시오>>");
		lu_x = sc.nextInt();
		lu_y = sc.nextInt();

		while(true) {
			System.out.print("오른쪽 하단 모서리의 좌표(x, y)를 입력하시오>>");
			rd_x = sc.nextInt();
			rd_y = sc.nextInt();
			
			if(!(rd_x<=lu_x || rd_y<=lu_y)) {
				break;
			}
			
			System.out.println("오른쪽 하단 모서리의 좌표는 왼쪽 상단 모서리의 좌표보다 커야합니다.");
		}
	
		System.out.print("점 (x, y)의 좌표를 입력하시오>>");
		x = sc.nextInt();
		y = sc.nextInt();

		inRect(x, y, lu_x, rd_x, lu_y, rd_y);
	
		sc.close();

	}

}
