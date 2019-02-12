package project;

import java.util.Scanner;

public class alpha {

	public static void main(String[] args) {
		System.out.println("exit to end the program.");
		Scanner s = new Scanner(System.in);
		while (true) {
			
			String alpha = s.nextLine();
			if(alpha.equals("exit"))
				break;
			alpha = alpha.toUpperCase();
			int[] count = new int[26];

			for (int i = 0; i < alpha.length(); i++) {
				char c = alpha.charAt(i);
				count[c - 'A']++;
			}

			int max_idx = 0;
			char result = 'A';
			for (int i = 1; i < count.length; i++) {
				if (count[max_idx] < count[i]) {
					max_idx = i;
					result = (char) (max_idx + 'A');
				} else if (count[max_idx] == count[i]) {
					result = '?';
				}
			}
			System.out.println(result);
		}
		s.close();
	}
}
