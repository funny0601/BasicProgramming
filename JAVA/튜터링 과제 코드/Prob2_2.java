package tutoring;

import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	String getName() {
		return this.name;
	}
	
	String getTel() {
		return this.tel;
	}
}
public class Prob2_2 {
	
	static String search(Phone[] pArray, String name) {
		// 반복문을 작성할 때, 배열의 길이를 for문 돌리는 횟수로 지정하는 것이 전형적 
		for(int i=0; i<pArray.length; i++) {
			if(pArray[i].getName().equals(name))
				return pArray[i].getTel();
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("인원수>>");
		int total = s.nextInt();
		
		Phone[] p = new Phone[total];
		
		/* Phone 배열 레퍼런스 변수가 static 선언이 되지 않는 이유
		 * static은 선언과 동시에 생기는 변수인데, 
		 * total 값은 사용자에게 입력을 받아야 생기는 값이므로
		 * 배열의 크기를 정할 수 없어 프로그램 실행과 동시에 만들어서 로드가 불가능
		 */
		
		for(int i=0; i<total; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			p[i] = new Phone(s.next(), s.next());
		}
		System.out.println("저장되었습니다...");
		
		String find_name, find_number;
		while(true) {
			
			System.out.print("검색할 이름(break 입력시 프로그램 종료)>>");
			find_name = s.next();
			if(find_name.equals("break"))
				break;
			find_number = search(p, find_name);
			if(find_number.equals(""))
				System.out.println(find_name+"이 없습니다.");
			else
				System.out.println(find_name+"의 번호는 "+find_number+" 입니다.");
		}
		
		s.close();
	}

}
