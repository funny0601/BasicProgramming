package tutoring;

import java.util.Scanner;


class Circle{
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius= radius;
	}
	
	public void equals(Circle c) {
		if(this.radius==c.radius) {
			System.out.println("They are the same.");
		}
		else
			System.out.println("They are different.");
	}
	
	public String toString() {
		return "Circle("+x+","+y+")반지름"+radius;
	}
}
public class Prob3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("The first circle (x, y, radius)");
		Circle a = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.print("The second circle (x, y, radius)");
		Circle b = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		System.out.println("원 a : "+a);
		System.out.println("원 b : "+b);
		
		a.equals(b);
		
		sc.close();
	}
}
