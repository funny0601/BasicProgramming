package tutoring;

import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	String getName() {
		return this.name;
	}
	
	String getTel() {
		return this.tel;
	}
}
public class Prob2_2 {
	
	static String search(Phone[] pArray, String name) {
		// �ݺ����� �ۼ��� ��, �迭�� ���̸� for�� ������ Ƚ���� �����ϴ� ���� ������ 
		for(int i=0; i<pArray.length; i++) {
			if(pArray[i].getName().equals(name))
				return pArray[i].getTel();
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("�ο���>>");
		int total = s.nextInt();
		
		Phone[] p = new Phone[total];
		
		/* Phone �迭 ���۷��� ������ static ������ ���� �ʴ� ����
		 * static�� ����� ���ÿ� ����� �����ε�, 
		 * total ���� ����ڿ��� �Է��� �޾ƾ� ����� ���̹Ƿ�
		 * �迭�� ũ�⸦ ���� �� ���� ���α׷� ����� ���ÿ� ���� �ε尡 �Ұ���
		 */
		
		for(int i=0; i<total; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			p[i] = new Phone(s.next(), s.next());
		}
		System.out.println("����Ǿ����ϴ�...");
		
		String find_name, find_number;
		while(true) {
			
			System.out.print("�˻��� �̸�(break �Է½� ���α׷� ����)>>");
			find_name = s.next();
			if(find_name.equals("break"))
				break;
			find_number = search(p, find_name);
			if(find_number.equals(""))
				System.out.println(find_name+"�� �����ϴ�.");
			else
				System.out.println(find_name+"�� ��ȣ�� "+find_number+" �Դϴ�.");
		}
		
		s.close();
	}

}
