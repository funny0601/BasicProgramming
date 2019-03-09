import java.util.Scanner;

abstract class Shape {

	public Shape next;

	public Shape() {
		next = null;
	}

	public abstract void draw();

}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

public class GraphicEditor {
	public static void main(String[] args) {
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
		Scanner s = new Scanner(System.in);

		Shape start = null;
		Shape last = null;

		int choice = s.nextInt();
		while (true) {
			switch (choice) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int ss = s.nextInt();
				switch (ss) {
				case 1:
					if (start == null) {
						start = new Line();
						last = start;
					} else {
						last.next = new Line();
						last = last.next;

					}
					break;
				case 2:
					if (start == null) {
						start = new Rect();
						last = start;
					} else {
						last.next = new Rect();
						last = last.next;
					}
					break;
				case 3:
					if (start == null) {
						start = new Circle();
						last = start;
					} else {
						last.next = new Circle();
						last = last.next;
					}
					break;
				}
				break;
			case 2:
				System.out.print("������ ������ ��ġ>>");
				int delete = s.nextInt();

				int i = 1;
				Shape delitem = null;
				Shape p = start;
				while (p != null) {
					int count = 0;
					Shape p3 = start;
					// ��ü ���� Ȯ�ο�

					for (count = 0; p3 != null; count++) {
						p3 = p3.next;
					}

					System.out.println(count + "��");

					if (delete > count) {
						System.out.println("������ �� �����ϴ�.");
						break;
					}

					if (delete == 1) {

						delitem = p;

						p = p.next;
						delitem = null;
						start = p;

						break; // ó�� ��� ����
					}

					else if (i == delete - 1) {
						if (p.next.next == null) {
							p.next = null;
							last = p;
							break;// �� ������ ��� ����
						}

						delitem = p.next;

						p.next = delitem.next;

						delitem = null;
						break;
					} // �߰��� ��� ����

					else {

						System.out.println(i);
						p = p.next;
						i++;

					}

				}

				break;
			case 3:
				Shape pp = start;
				while (pp != null) {
					pp.draw();
					pp = pp.next;
				}
				break;
			}

			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			s = new Scanner(System.in);
			choice = s.nextInt();
			if (choice == 4) {
				System.out.print("beauty�� �����մϴ�.");
				s.close();
				return;
			}

		}

	}
}
