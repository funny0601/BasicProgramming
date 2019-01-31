import java.util.Scanner;

public class week2_1 {
	
	public static void findMid() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int num[] = {a, b, c};
		int temp;
	
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(num[i]>=num[j])
					continue;
				else
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
			}
		}
		for(int k=0; k<3; k++)
			System.out.print(num[k]+" ");
		System.out.println("중간 값:"+num[1]);
	
	}
	public static void main(String[] args) {
		findMid();
	}
}
