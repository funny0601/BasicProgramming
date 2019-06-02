package exam;

class Person {
	public String name;
	private int age;
	private int id;

	public Person() {
	}

	public Person(String n, int a, int id) {
		name = n;
		age = a;
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public String toString() {
		return name + " " + getAge() + " " + getId();
	}

}

class Student extends Person {
	public double grade;

	public Student() {
		this.name = "Kim";
		setAge(21);
		setId(1001);
		this.grade = 3.5;
	}

	public Student(String n, int a, int id, double g) {
		super(n, a, id);
		this.grade = g;
	}

	public String toString() {
		return name + " " + getAge() + " " + getId() + " " + grade;
	}
	
	public void PrintHi() {
		System.out.println("hi");
	}
}

public class Exam2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Park", 20, 1002, 3.9);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.name + "'s grade is " + s1.grade);
		System.out.println(s2.name + "'s grade is " + s2.grade);

		Person[] p = new Person[2];
		
		p[0] = s1;
		p[1] = s2; //자식에서 부모로 갈 때
		// 업캐스팅, 
		
		//s1 = (Student) p[0]; //부모에서 자식으로 갈 때
		
		//p[0].PrintHi(); 접근 불가
		
		System.out.println(p[0]);
		System.out.println(p[1]); // 동적바인딩 되어서 Student의 toString() 메소드가 실행
	}
}
