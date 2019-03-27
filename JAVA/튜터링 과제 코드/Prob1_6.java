package tutoring;

import java.util.Scanner;

public class Prob1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] rsp_array = { "가위", "바위", "보" };
		String s;
		int user_rsp;
		int computer_rsp;

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {

			System.out.print("가위 바위 보!(가위:0, 바위:1, 보:2)>>");

			s = sc.next();
			if (s.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}

			user_rsp = Integer.parseInt(s);
			computer_rsp = (int) (Math.random() * 3);

			System.out.println(rsp_array[user_rsp] + "를 냈습니다.");

			if (user_rsp == computer_rsp) {
				System.out.println("사용자 = " + rsp_array[user_rsp] + " , 컴퓨터 = " + rsp_array[computer_rsp] + ", 비겼습니다.");
				continue;
			} // 비긴 경우

			if (computer_rsp == 0) {
				if (user_rsp == 1)
					System.out.println("사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.");
				else if (user_rsp == 2)
					System.out.println("사용자 = 보, 컴퓨터 = 가위, 컴퓨터가 이겼습니다.");
			} 
			else if (computer_rsp==1) {
				if (user_rsp==0)
					System.out.println("사용자 = 가위, 컴퓨터 = 바위, 컴퓨터가 이겼습니다.");
				else if (user_rsp==2)
					System.out.println("사용자 = 보, 컴퓨터 = 바위, 사용자가 이겼습니다.");
			} 
			else if (computer_rsp==2) {
				if (user_rsp==0)
					System.out.println("사용자 = 가위, 컴퓨터 = 보, 사용자가 이겼습니다.");
				else if (user_rsp == 1)
					System.out.println("사용자 = 바위, 컴퓨터 = 보, 컴퓨터가 이겼습니다.");
			}

		}

		sc.close();
	}

}
