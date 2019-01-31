package project;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {
			String s1 = s.nextLine();
			StringTokenizer st = new StringTokenizer(s1, " ");

			int rep_num = Integer.parseInt(st.nextToken());
			String alpha = st.nextToken();

			if (rep_num < 1 || rep_num > 9) {
				System.out.println("wrong");
				break;
			}

			if (alpha.length() >= 21 || alpha.length() < 1) {
				System.out.println("wrong");
				break;
			}

			for (int i = 0; i < alpha.length(); i++) {
				for (int j = 0; j < rep_num; j++) {
					System.out.print(alpha.charAt(i));
				}
			}
			System.out.println("");
		}
		
		s.close();
	}
}
