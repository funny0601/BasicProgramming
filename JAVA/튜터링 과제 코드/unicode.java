package tutoring;

public class unicode {
	public static void main(String[] args) {
		char a = 'A';
		char A = '\u0041';
		
		System.out.println(a+A);
		
		//int���� char������ �� ū �ڷ����̶� 
		//char���� int������ �ڵ�����ȯ �� �Ŀ� ���
		
		System.out.println("a�� int�� ��:"+(int)a);
		System.out.println("A�� int�� ��:"+(int)A);
		//System.out.println(a);
		//System.out.println(A);
		System.out.println((char)a);
		System.out.println((char)A);

		System.out.println((char)a+""+(char)A);
		
	}
}
