import java.util.*;
public class Example7_3 {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �̸��� �α��� exit�� �Էµɶ����� �Է��ϼ���.(��: Korea 5000)");
		while(true) { // "�׸�"�� �Էµ� ������ �ݺ�
			System.out.print("���� �̸�, �α� >> ");		
			String nation = scanner.next();
			if(nation.equals("exit"))
				break; // �Է� ��
			int population = scanner.nextInt();
			nations.put(nation, population); // �ؽø� �����̸��� �μ� ����
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String nation = scanner.next();
			if(nation.equals("exit"))
				break;
			Integer n = nations.get(nation);
			if(n == null)
				System.out.println(nation + " ����� �����ϴ�.");
			else 
				System.out.println(nation + "�� �α��� " + n); 
		}
		
		scanner.close();
	}

}
