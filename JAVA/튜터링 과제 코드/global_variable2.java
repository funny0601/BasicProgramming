package tutoring;

class global_variable2 {
	
	static int i = 0;
	
	static void a() {
      i = 0;
      System.out.println("나는 static: "+i);
  } //static 메소드는 static 멤버만 접근 가능

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
        a();
        System.out.println(i);
    } // for 문 안의 i와 static의 i 변수가 다르다는 것을 보여줌
    
  }
}
