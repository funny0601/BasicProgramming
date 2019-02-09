/*
 * B(2<=B<=10)�� �Է����� �� ������Ī��ȯ�� ã�� �ʹ�.
 * ������Ī��ȯ�̶� 1���� 300������ �� �߿��� �� ������ B������ ǥ������ ��,
 * �¿��Ī�� �Ǵ� ��츦 ���Ѵ�.
 * 
 * B=2�� ��, 1�� 3�� ������Ī��ȯ�� �ȴ�.
 * 1^2 = 1 -> [1]
 * 3^2 = 9 -> [1001]
 * 
 * B �Է½� ������Ī��ȯ ��� �� ������ ���ϴ� ���α׷��� �ۼ��϶�.
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
		
		//System.out.println("���޹��� ���� " + num + "�Դϴ�.");

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
		System.out.println(count+"���� ������Ī��ȯ�� �ֽ��ϴ�.");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		while (true) {
			if (num >= 2 && num <= 10)
				break;
			System.out.println("2���� 10 ������ ���ڸ� �Է����ּ���.");
			num = s.nextInt();
		}
		
		DivDigit(num);
		s.close();
	}
}
