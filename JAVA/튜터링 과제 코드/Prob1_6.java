package tutoring;

import java.util.Scanner;

public class Prob1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] rsp_array = { "����", "����", "��" };
		String s;
		int user_rsp;
		int computer_rsp;

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while (true) {

			System.out.print("���� ���� ��!(����:0, ����:1, ��:2)>>");

			s = sc.next();
			if (s.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}

			user_rsp = Integer.parseInt(s);
			computer_rsp = (int) (Math.random() * 3);

			System.out.println(rsp_array[user_rsp] + "�� �½��ϴ�.");

			if (user_rsp == computer_rsp) {
				System.out.println("����� = " + rsp_array[user_rsp] + " , ��ǻ�� = " + rsp_array[computer_rsp] + ", �����ϴ�.");
				continue;
			} // ��� ���

			if (computer_rsp == 0) {
				if (user_rsp == 1)
					System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				else if (user_rsp == 2)
					System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
			} 
			else if (computer_rsp==1) {
				if (user_rsp==0)
					System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				else if (user_rsp==2)
					System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
			} 
			else if (computer_rsp==2) {
				if (user_rsp==0)
					System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
				else if (user_rsp == 1)
					System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.");
			}

		}

		sc.close();
	}

}
