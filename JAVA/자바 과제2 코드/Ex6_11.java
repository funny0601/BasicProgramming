import java.util.Scanner;

public class Ex6_11 {

	public static void main(String[] args) {
		System.out.print(">>");
		Scanner s = new Scanner(System.in);
		String sentence = s.nextLine();
		StringBuffer sb = new StringBuffer(sentence);

		while (true) {
			System.out.print("���: ");
			String order = s.nextLine();
			if (order.equals("�׸�")) {
				System.out.print("�����մϴ�");
				break;
			}
			String[] tokens = order.split("!");
			if (tokens.length != 2) {
				System.out.println("�߸��� ����Դϴ�!");
			} else {
				if (tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("�߸��� ����Դϴ�!");
					continue;
				}

				int index = sb.indexOf(tokens[0]);
				if (index == -1) {
					System.out.println("ã�� �� �����ϴ�!");
					continue;
				}
				sb.replace(index, index + tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
		}

		s.close();

	}

}
