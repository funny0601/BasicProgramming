package tutoring;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Prob3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> v = new Vector<String>();
		String input, find;
		String[] input_array;
		boolean end_sign = false;

		while (true) {
			System.out.print(">>");
			input = sc.nextLine();
			input_array = input.split(" ");
			for (int i = 0; i < input_array.length; i++) {
				if (input_array[i].equals("stop")) {
					end_sign = true;
					break;
				}
				v.add(input_array[i]);
			}

			if (end_sign) {
				System.out.println("종료합니다.");
				break;
			}
		}

		Collections.sort(v);
		Iterator<String> it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.print("찾고 싶은 과일은? ");
		find = sc.next();
		int index=Collections.binarySearch(v, find);
		if(index<0) {
			System.out.println("없습니다.");
			sc.close();
		}else {
			System.out.println(index);
			sc.close();
		}
	}
}
