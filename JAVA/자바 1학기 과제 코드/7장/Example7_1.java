import java.util.*;
public class Example7_1 {
	
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����(-1�� �Էµ� ������)>> ");
		while(true) {
			int n = scanner.nextInt();
			if(n == -1) // �Էµ� ���� -1�̸�
				break;
			v.add(n);
		}
		
		if(v.size() == 0) {
			System.out.print("���� �ϳ��� ����");
			scanner.close();
			return;
		}
		int max=v.get(0), x;
		for (int i=1; i<v.size(); i++){
			x=v.get(i);
			if(max< x) max=x;
		}
		System.out.println("The biggest number=" +max);
		//printBig(v); // ���� v�� ���� �� ���� ū �� ���
		scanner.close();
	}


}
