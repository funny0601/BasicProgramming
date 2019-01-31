package chap01;

public class ex1 {
	public static void findMax(int a, int b, int c) {
		//1.사용자에게 입력 받은 3개의 정수 중에서 최대값을 찾는 프로그램 구현하기
		int max=a;
		
		if(max<b) max=b;
		if(max<c) max=c;
		
		System.out.println("최대값:"+max);	
	}
	
	public static void doubleNum(int a) {
		//2.사용자가 입력된 숫자를 두 배 하여 출력하는 프로그램 구현하기
		System.out.println(a*2);
	}
	
	public static void circle(int a) {
		//3.입력받은 반지름이 a인 원의 넓이와 둘레를 계산하는 프로그램 구현하기
		System.out.println("반지름: "+ 2*a*(3.14));
		System.out.println("넓이: "+ a*a*(3.14));
	}
	
	public static void divide(int a, int b) {
		//4.입력받은 숫자 a를 입력받은 또 다른 숫자 b으로 나누었을 때 그 몫과 나머지 값을 구하기
		System.out.println("몫: "+ a/b);
		System.out.println("몫: "+ a%b);
	}
	
	public static void oddEven(int a) {
		if(a%2==0)
			System.out.println("The number "+a+" is even");
		else
			System.out.println("The number "+a+" is odd");
		//5.입력받은 자연수가 홀수인지 짝수인지 판별하는 프로그램 구현하기
	
	}
	
	public static void getAver(int a, int b, int c) {
		//6.입력받은 점수의 평균을 구하는 프로그램 구현하기 (과목은 3가지)
		System.out.println("평균: "+ (a+b+c)/3 );
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






