import java.util.Scanner;

class Add {
	public static int a, b;
	public static int calculate(int a, int b) {
		return a+b;
	}
	
	public static double calculate(double a, double b) {
		return a+b;
	}
}

class Mul {
	public static int a, b;
	public static int calculate(int a, int b) {
		return a*b;
	}
	
	public static double calculate(double a, double b) {
		return a*b;
	}
}

class Sub {
	public static int a, b;
	public static int calculate(int a, int b) {
		return a-b;
	}
	
	public static double calculate(double a, double b) {
		return a-b;
	}
}

class Div {
	public static int a, b;
	public static int calculate(int a, int b) {
		try {
			return a/b;
		}catch(ArithmeticException e) {
			System.out.print("0���� ���� �� �����ϴ�.");
			return 0;
		}

	}
	
	public static double calculate(double a, double b) {
		try {
			return a/b;

		}catch(ArithmeticException e) {
			System.out.print("0���� ���� �� �����ϴ�.");
			return 0;
		}

	}
	
}

public class Calc {
	public static void main (String args[])  {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		char operator = scanner.next().charAt(0); // �����ڸ� ���ڷ� ��ȯ
		
		switch (operator) {
			case '+':
				System.out.println(Add.calculate(a, b));
				break;
			case '-':
				System.out.println(Sub.calculate(a, b));
				break;
			case '*':
				System.out.println(Mul.calculate(a, b));
				break;
			case '/':
				System.out.println(Div.calculate(a, b));
				break;
			default:
				System.out.println("�߸��� �������Դϴ�.");
		}
		
		System.out.print("�� �Ǽ��� �����ڸ� �Է��Ͻÿ�>>");
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		
		operator = scanner.next().charAt(0); // �����ڸ� ���ڷ� ��ȯ
		
		switch (operator) {
			case '+':
				System.out.println(Add.calculate(c, d));
				break;
			case '-':
				System.out.println(Sub.calculate(c, d));
				break;
			case '*':
				System.out.println(Mul.calculate(c, d));
				break;
			case '/':
				System.out.println(Div.calculate(c, d));
				break;
			default:
				System.out.println("�߸��� �������Դϴ�.");
		}
		
		scanner.close();
	}
}
