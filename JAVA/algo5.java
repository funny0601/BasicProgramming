/*
 * B(2<=B<=10)를 입력했을 때 진수대칭변환을 찾고 싶다.
 * 진수대칭변환이란 1부터 300까지의 수 중에서 그 제곱을 B진수로 표현했을 때,
 * 좌우대칭이 되는 경우를 말한다.
 * 
 * B=2일 때, 1과 3은 진수대칭변환이 된다.
 * 1^2 = 1 -> [1]
 * 3^2 = 9 -> [1001]
 * 
 * B 입력시 진수대칭변환 출력 후 개수를 구하는 프로그램을 작성하라.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class algo5 {

	static void DivDigit(int num) {
		
		ArrayList<Integer> DigitList = new ArrayList<Integer>();
		ArrayList<Integer> ReverseList = new ArrayList<Integer>();
		
		boolean flag;
		int range;
		int count=0;
		
		//System.out.println("전달받은 수는 " + num + "입니다.");

		for (int i = 1; i < 301; i++) {

			range = i*i;
			flag = true;

			while (range != 0) {
				DigitList.add(range % num);
				range = range / num;
			}

			for (int j = DigitList.size() - 1; j >= 0; j--) {
				ReverseList.add(DigitList.get(j));
			}

			for (int k = 0; k < DigitList.size(); k++) {
				if (ReverseList.get(k) != DigitList.get(k)) {
					flag = false;
				}
			}

			if (flag) {
				count++;
				
				System.out.print(i + " ");

				for (int j = DigitList.size() - 1; j >= 0; j--) {
					System.out.print(DigitList.get(j));
				}
				System.out.println("");
			}
	
			ReverseList.clear();
			DigitList.clear();
		}
		System.out.println(count+"개의 진수대칭변환이 있습니다.");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		while (true) {
			if (num >= 2 && num <= 10)
				break;
			System.out.println("2부터 10 사이의 숫자를 입력해주세요.");
			num = s.nextInt();
		}
		
		DivDigit(num);
		s.close();
	}
}
