package chap01;

public class ex1 {
	public static void findMax(int a, int b, int c) {
		//1.����ڿ��� �Է� ���� 3���� ���� �߿��� �ִ밪�� ã�� ���α׷� �����ϱ�
		int max=a;
		
		if(max<b) max=b;
		if(max<c) max=c;
		
		System.out.println("�ִ밪:"+max);	
	}
	
	public static void doubleNum(int a) {
		//2.����ڰ� �Էµ� ���ڸ� �� �� �Ͽ� ����ϴ� ���α׷� �����ϱ�
		System.out.println(a*2);
	}
	
	public static void circle(int a) {
		//3.�Է¹��� �������� a�� ���� ���̿� �ѷ��� ����ϴ� ���α׷� �����ϱ�
		System.out.println("������: "+ 2*a*(3.14));
		System.out.println("����: "+ a*a*(3.14));
	}
	
	public static void divide(int a, int b) {
		//4.�Է¹��� ���� a�� �Է¹��� �� �ٸ� ���� b���� �������� �� �� ��� ������ ���� ���ϱ�
		System.out.println("��: "+ a/b);
		System.out.println("��: "+ a%b);
	}
	
	public static void oddEven(int a) {
		if(a%2==0)
			System.out.println("The number "+a+" is even");
		else
			System.out.println("The number "+a+" is odd");
		//5.�Է¹��� �ڿ����� Ȧ������ ¦������ �Ǻ��ϴ� ���α׷� �����ϱ�
	
	}
	
	public static void getAver(int a, int b, int c) {
		//6.�Է¹��� ������ ����� ���ϴ� ���α׷� �����ϱ� (������ 3����)
		System.out.println("���: "+ (a+b+c)/3 );
	}
	
	public static void main(String args[]) {
		findMax(42, 21, 18);
		doubleNum(14);
		circle(4);
		divide(17, 5);
		oddEven(17);
		getAver(80,90,70);
		
	}	
}






