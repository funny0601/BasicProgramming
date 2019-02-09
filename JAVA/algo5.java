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
		// 입력된 숫자 값에 따라 변경된 진수가 거꾸로 저장된 리스트
		ArrayList<Integer> ReverseList = new ArrayList<Integer>(); 
		// 거꾸로 저장된 리스트를 다시 역으로 저장하여 진짜 진수 형태 저장
		
		boolean flag; // 두 리스트가 같은 지 다른 지 확인하는 데 사용할 boolean 타입 변수
		int range; // 숫자 범위
		int count=0; // 진수변환대칭 개수 count하는 변수 
		
		//System.out.println("전달받은 수는 " + num + "입니다.");

		for (int i = 1; i < 301; i++) {

			range = i*i; // 제곱
			flag = true; 

			while (range != 0) {
				DigitList.add(range % num);
				// 입력된 숫자로 나누어 그 나머지를 저장
				range = range / num;
				// 입력된 숫자로 나누었을 때의 몫으로 숫자를 갱신
			} // 숫자가 0일 경우에 더 이상 나누지 않고 탈출

			for (int j = DigitList.size() - 1; j >= 0; j--) {
				ReverseList.add(DigitList.get(j));
			} // 리스트 요소를 끝에서부터 하나씩 새로운 리스트에 저장

			for (int k = 0; k < DigitList.size(); k++) {
				if (ReverseList.get(k) != DigitList.get(k)) {
					flag = false; 
					// 기본 flag의 boolean값은 true로, 
					// 두 리스트가 동일할 경우 true가 유지되고
					// 두 리스트가 동일하지 않을 경우 false로 변경
				}
			}
			// flag 값이 true일 경우
			if (flag) {
				count++;
				// 진수대칭변환 개수 증가
				System.out.print(i + " ");

				for (int j = DigitList.size() - 1; j >= 0; j--) {
					System.out.print(DigitList.get(j));
				} // 리스트 요소 하나하나 출력하기
				System.out.println("");
			}
	
			ReverseList.clear(); // 다음 iteration을 위해 리스트 clear
			DigitList.clear(); // 다음 iteration을 위해 리스트 clear
		}
		System.out.println(count+"개의 진수대칭변환이 있습니다.");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		while (true) {
			if (num >= 2 && num <= 10)
				break; // 탈출 조건 설정 
			System.out.println("2부터 10 사이의 숫자를 입력해주세요.");
			num = s.nextInt();
		}
		
		DivDigit(num);
		// 함수 호출
		s.close();
	}
}
