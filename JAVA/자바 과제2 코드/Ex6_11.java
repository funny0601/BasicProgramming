import java.util.Scanner;

public class Ex6_11 {

	public static void main(String[] args) {
		System.out.print(">>");
		Scanner s = new Scanner(System.in);
		String sentence = s.nextLine();
		StringBuffer sb = new StringBuffer(sentence);

		while (true) {
			System.out.print("명령: ");
			String order = s.nextLine();
			if (order.equals("그만")) {
				System.out.print("종료합니다");
				break;
			}
			String[] tokens = order.split("!");
			if (tokens.length != 2) {
				System.out.println("잘못된 명령입니다!");
			} else {
				if (tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("잘못된 명령입니다!");
					continue;
				}

				int index = sb.indexOf(tokens[0]);
				if (index == -1) {
					System.out.println("찾을 수 없습니다!");
					continue;
				}
				sb.replace(index, index + tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
		}

		s.close();

	}

}
