import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex6_7 {

	public static void main(String[] args) {

		System.out.println("(1)StringTokenizer Ŭ������ �̿��Ͽ� �ۼ�");
		System.out.print(">>");
		Scanner s = new Scanner(System.in);
		String sentence = s.nextLine();
		while (!sentence.equals("�׸�")) {
			StringTokenizer st = new StringTokenizer(sentence, " ");
			System.out.println("���� ������ " + st.countTokens());
			System.out.print(">>");
			sentence = s.nextLine();
		}
		System.out.println("�����մϴ�...");
		
		System.out.println("(2)String Ŭ������ split() �޼ҵ带 �̿��Ͽ� �ۼ�");
		System.out.print(">>");
		sentence = s.nextLine();
		while (!sentence.equals("�׸�")) {
			String token[] =sentence.split(" ");
			System.out.println("���� ������ " +token.length );
			System.out.print(">>");
			sentence = s.nextLine();
		}
		System.out.println("�����մϴ�...");
		s.close();
	}
}
