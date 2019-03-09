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
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
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
				System.out.print("삭제할 도형의 위치>>");
				int delete = s.nextInt();

				int i = 1;
				Shape delitem = null;
				Shape p = start;
				while (p != null) {
					int count = 0;
					Shape p3 = start;
					// 전체 개수 확인용

					for (count = 0; p3 != null; count++) {
						p3 = p3.next;
					}

					System.out.println(count + "개");

					if (delete > count) {
						System.out.println("삭제할 수 없습니다.");
						break;
					}

					if (delete == 1) {

						delitem = p;

						p = p.next;
						delitem = null;
						start = p;

						break; // 처음 노드 삭제
					}

					else if (i == delete - 1) {
						if (p.next.next == null) {
							p.next = null;
							last = p;
							break;// 맨 마지막 노드 삭제
						}

						delitem = p.next;

						p.next = delitem.next;

						delitem = null;
						break;
					} // 중간에 노드 삭제

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

			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			s = new Scanner(System.in);
			choice = s.nextInt();
			if (choice == 4) {
				System.out.print("beauty을 종료합니다.");
				s.close();
				return;
			}

		}

	}
}
