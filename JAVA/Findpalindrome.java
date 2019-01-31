import java.util.Scanner;

class Decision {
	public int decision(char[] c1) {
		int length = c1.length;
		while (true) {
			for (int i = 0; i < length; i++) {
				if (c1[i] != c1[length - 1 - i]) {
					System.out.println("회문이 아닙니다.");
					return 0;
				}
			}
			System.out.println("회문입니다.");
			return 0;
		}
	}
}

public class Findpalindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			String word = s.nextLine();
			char[] ch = word.toCharArray();
			if(ch.equals("EXIT"))
				break;
			Decision d = new Decision();

			d.decision(ch);
		}

	}
}
