package tutoring;

class Rectangle{
	String name;
	int x, y, width, height;
	
	//- void compare(Rectangle r)�� �ۼ��Ͽ� ���̸� ���ϰ� ���� ����� ���� ����Ʈ�϶�.
	public Rectangle(String name, int x, int y, int width, int height) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.width =width;
		this.height = height;	
	}
	public Rectangle(String name, int width, int height) {
		this(name, 0, 0, width, height);
	}
	void compare(Rectangle r) {
		if(this.width*this.height > r.width*r.height)
			System.out.println(this.name+" is greater than "+r.name);
		else
			System.out.println(r.name+" is greater than "+this.name);
	}
	int square() {
		return width*height;
	}
	void show() {
		System.out.println("("+this.x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	boolean contains(Rectangle r) {
		
		boolean result1 = (r.x>this.x)&&(r.y>this.y);
		boolean result2 = (this.x+this.width)>(r.x+r.width);
		boolean result3 = (this.y+this.height)>(r.y+r.height);
			
		if (result1&&result2&&result3)	return true;
		else return false;
	}
	
	
}
public class Prob2_1 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle("R",2, 2, 8, 7);
		Rectangle s = new Rectangle("S",5, 5, 6, 6);
		Rectangle t = new Rectangle("T", 1, 1, 10, 10);
		Rectangle u = new Rectangle("U", 5, 8);
		
		r.show();
		System.out.println("s�� ������ "+s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
		u.compare(r);
		u.compare(s);

	}

}
