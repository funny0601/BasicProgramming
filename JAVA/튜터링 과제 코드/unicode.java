package tutoring;

public class unicode {
	public static void main(String[] args) {
		char a = 'A';
		char A = '\u0041';
		
		System.out.println(a+A);
		
		//int형이 char형보다 더 큰 자료형이라서 
		//char형이 int형으로 자동형변환 한 후에 계산
		
		System.out.println("a의 int형 값:"+(int)a);
		System.out.println("A의 int형 값:"+(int)A);
		//System.out.println(a);
		//System.out.println(A);
		System.out.println((char)a);
		System.out.println((char)A);

		System.out.println((char)a+""+(char)A);
		
	}
}
