package tutoring;

import java.util.Scanner;

interface Stack {
	int length(); // ���� ���ÿ� ����� ���� ����
	int capacity(); // ������ ��ü ���� ������ ���� ����
	int pop(); // ������ top�� ����� ���� ����
	boolean push(int val); // ������ top�� ���� ����
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
		System.out.print("�� ���� ���� ������ ũ�� �Է�>>");
		int size = s.nextInt();

		IntStack stack = new IntStack(size);

		int number = (int) (Math.random() * size) + 1;
		System.out.println("Random number is " + number);

		System.out.print("Integer stored in the stack : ");
		for (int i = number; i >= 0; i--) {
			stack.push(i);
			System.out.print(stack.pop() + " ");
		}

		// System.out.println("����� ���� ����: "+ stack.length());
		// System.out.println("��� ���� ���� ����: "+stack.capacity());
	}

}
