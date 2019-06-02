package tutoring;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Prob3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> precip = new Vector<Integer>();
		Iterator<Integer> it;
		int number, value, avg, sum;

		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>>");
			number =sc.nextInt();
			if(number==0) {
				break;
			}
			precip.add(number);
			it = precip.iterator();
			sum=0;
			while (it.hasNext()) {
				value = it.next();
				System.out.print(value+" ");
				sum += value;
			}
			System.out.println("");
			avg = sum / precip.size();
			System.out.println("���� ��� "+ avg);
		}
		
		if(precip.size()==0) {
			sc.close();
			return;
		}
		
		System.out.println("�ִ� ������:" + Collections.max(precip));
		System.out.println("�ּ� ������:" + Collections.min(precip));
		sc.close();
	}

}
