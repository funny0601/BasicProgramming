import java.util.*;
public class Example7_1 {
	
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(true) {
			int n = scanner.nextInt();
			if(n == -1) // 입력된 수가 -1이면
				break;
			v.add(n);
		}
		
		if(v.size() == 0) {
			System.out.print("수가 하나도 없음");
			scanner.close();
			return;
		}
		int max=v.get(0), x;
		for (int i=1; i<v.size(); i++){
			x=v.get(i);
			if(max< x) max=x;
		}
		System.out.println("The biggest number=" +max);
		//printBig(v); // 벡터 v의 정수 중 가장 큰 수 출력
		scanner.close();
	}


}
