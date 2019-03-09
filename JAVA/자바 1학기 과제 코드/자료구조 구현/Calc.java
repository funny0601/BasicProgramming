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
			System.out.print("0으로 나눌 수 없습니다.");
			return 0;
		}

	}
	
	public static double calculate(double a, double b) {
		try {
			return a/b;

		}catch(ArithmeticException e) {
			System.out.print("0으로 나눌 수 없습니다.");
			return 0;
		}

	}
	
}

public class Calc {
	public static void main (String args[])  {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		char operator = scanner.next().charAt(0); // 연산자를 문자로 변환
		
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
				System.out.println("잘못된 연산자입니다.");
		}
		
		System.out.print("두 실수와 연산자를 입력하시오>>");
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		
		operator = scanner.next().charAt(0); // 연산자를 문자로 변환
		
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
				System.out.println("잘못된 연산자입니다.");
		}
		
		scanner.close();
	}
}
