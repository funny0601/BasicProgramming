package tutoring;

import java.util.Scanner;

public class DominatingDoubleForLoop {
   public static void main(String[] args) {
	   int MAX = 10;

	   for(int i=0; i<MAX; i++) { // 일단 10줄로 출력될 거니까 0부터 9까지 총 10번 for문 돌림
		  for(int j=MAX; i<j; j--) { 
			  /* 각 줄 마다의 별 출력 횟수를 또 for문을 돌리는데
			   * 문제는 각 줄마다 개수가 하나씩 줄어들고 있음
			   * i는 0부터 하나씩 늘고 있으니까 별의 총 개수를 <10 - i>로 생각해주면 
			   * 0번째 열에서는 10-0 = 10개 출력
			   * 1번째 열에서는 10-1 = 9개 출력
			   * 이렇게 됨
			   * 그래서 두 번째 for문에서 j를 10(여기서는 MAX 값)으로 두고 
			   * i (몇 번째 줄인지 체크하는 변수) < j 해 놓은 다음에 j를 하나씩 줄여나가서 i를 만나게 시키는 거임
			   */
			  System.out.print("*");
		  }
		  System.out.println("");
	  }
   }
}