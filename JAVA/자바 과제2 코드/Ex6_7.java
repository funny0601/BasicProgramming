import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex6_7 {

	public static void main(String[] args) {

		System.out.println("(1)StringTokenizer 클래스를 이용하여 작성");
		System.out.print(">>");
		Scanner s = new Scanner(System.in);
		String sentence = s.nextLine();
		while (!sentence.equals("그만")) {
			StringTokenizer st = new StringTokenizer(sentence, " ");
			System.out.println("어절 개수는 " + st.countTokens());
			System.out.print(">>");
			sentence = s.nextLine();
		}
		System.out.println("종료합니다...");
		
		System.out.println("(2)String 클래스의 split() 메소드를 이용하여 작성");
		System.out.print(">>");
		sentence = s.nextLine();
		while (!sentence.equals("그만")) {
			String token[] =sentence.split(" ");
			System.out.println("어절 개수는 " +token.length );
			System.out.print(">>");
			sentence = s.nextLine();
		}
		System.out.println("종료합니다...");
		s.close();
	}
}
