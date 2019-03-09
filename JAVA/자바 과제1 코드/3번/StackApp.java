import java.util.Scanner;

public class StackApp {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		StringStack ss = new StringStack(); 
		
		while(true) {
			System.out.print("정수 입력 >> ");
			int val = scanner.nextInt();

			boolean res = ss.push(val); 
			if(res == false) {
				System.out.println("스택이 꽉 차서 더 이상 푸시 불가!");
				break;
			}
		}
		
		System.out.print("스택에 저장된 모든 정수 팝 : ");
		int len = ss.length();
		for(int i=0; i<len; i++) {
			System.out.print(ss.pop() + " "); 
		}

		scanner.close();
	}
}
