import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = { "����", "����", "��" };
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�. ");
		while (true) {
			System.out.print("���� ���� ��! >> ");
			String user = scanner.next();
			int n = (int) (Math.random() * 3);

			if (str[n].equals("����")) {
				if (user.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				else if (user.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				else if (user.equals("��"))
					System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�. ");
			} else if (str[n].equals("����")) {
				if (user.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				else if (user.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				else if (user.equals("��"))
					System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�. ");
			} else if (str[n].equals("��")) {
				if (user.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
				else if (user.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.");
				else if (user.equals("��"))
					System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�. ");
			}

			System.out.print("Continue?(yes/no)");
			String answer = scanner.next();
			if (answer.equals("no")) {
				System.out.println("������ �����մϴ�.");
				break;
			}

		}
		scanner.close();
	}
}
