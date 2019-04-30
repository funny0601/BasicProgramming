package tutoring;

import java.util.Scanner;

interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	int pop(); // 스택의 top에 저장된 정수 리턴
	boolean push(int val); // 스택의 top에 정수 저장
}

class IntStack implements Stack {
	int array[];
	int i = 0;

	public IntStack(int size) {
		array = new int[size];
	}

	@Override
	public int length() {
		return i;
	}

	@Override
	public int capacity() {
		return (array.length - i);
	}

	@Override
	public int pop() {
		return array[i - 1];
	}

	@Override
	public boolean push(int val) {
		if (i >= array.length) {
			return false;
		} else {
			array[i] = val;
			i++;
			return true;
		}
	}
}

public class Prob2_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		int size = s.nextInt();

		IntStack stack = new IntStack(size);

		int number = (int) (Math.random() * size) + 1;
		System.out.println("Random number is " + number);

		System.out.print("Integer stored in the stack : ");
		for (int i = number; i >= 0; i--) {
			stack.push(i);
			System.out.print(stack.pop() + " ");
		}

		// System.out.println("저장된 스택 길이: "+ stack.length());
		// System.out.println("사용 가능 스택 길이: "+stack.capacity());
	}

}
