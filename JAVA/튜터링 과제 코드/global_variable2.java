package tutoring;

class global_variable2 {
	
	static int i = 0;
	
	static void a() {
      i = 0;
      System.out.println("���� static: "+i);
  } //static �޼ҵ�� static ����� ���� ����

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
        a();
        System.out.println(i);
    } // for �� ���� i�� static�� i ������ �ٸ��ٴ� ���� ������
    
  }
}
