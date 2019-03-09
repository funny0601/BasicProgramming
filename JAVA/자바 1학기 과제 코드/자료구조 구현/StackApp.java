import java.util.Scanner;

public class StackApp {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		StringStack ss = new StringStack(); 
		
		while(true) {
			System.out.print("���� �Է� >> ");
			int val = scanner.nextInt();

			boolean res = ss.push(val); 
			if(res == false) {
				System.out.println("������ �� ���� �� �̻� Ǫ�� �Ұ�!");
				break;
			}
		}
		
		System.out.print("���ÿ� ����� ��� ���� �� : ");
		int len = ss.length();
		for(int i=0; i<len; i++) {
			System.out.print(ss.pop() + " "); 
		}

		scanner.close();
	}
}
