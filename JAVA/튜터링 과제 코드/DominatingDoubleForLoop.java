package tutoring;

import java.util.Scanner;

public class DominatingDoubleForLoop {
   public static void main(String[] args) {
	   int MAX = 10;

	   for(int i=0; i<MAX; i++) { // �ϴ� 10�ٷ� ��µ� �Ŵϱ� 0���� 9���� �� 10�� for�� ����
		  for(int j=MAX; i<j; j--) { 
			  /* �� �� ������ �� ��� Ƚ���� �� for���� �����µ�
			   * ������ �� �ٸ��� ������ �ϳ��� �پ��� ����
			   * i�� 0���� �ϳ��� �ð� �����ϱ� ���� �� ������ <10 - i>�� �������ָ� 
			   * 0��° �������� 10-0 = 10�� ���
			   * 1��° �������� 10-1 = 9�� ���
			   * �̷��� ��
			   * �׷��� �� ��° for������ j�� 10(���⼭�� MAX ��)���� �ΰ� 
			   * i (�� ��° ������ üũ�ϴ� ����) < j �� ���� ������ j�� �ϳ��� �ٿ������� i�� ������ ��Ű�� ����
			   */
			  System.out.print("*");
		  }
		  System.out.println("");
	  }
   }
}