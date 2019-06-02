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
			System.out.print("강수량 입력 (0 입력시 종료)>>");
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
			System.out.println("현재 평균 "+ avg);
		}
		
		if(precip.size()==0) {
			sc.close();
			return;
		}
		
		System.out.println("최대 강수량:" + Collections.max(precip));
		System.out.println("최소 강수량:" + Collections.min(precip));
		sc.close();
	}

}
