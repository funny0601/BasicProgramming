interface Stack {
	int length(); // ���� ���ÿ� ����� ���� ����
	int capacity(); // ������ ��ü ���� ������ ���� ����
	int pop(); // ������ ��(top)�� �Ǽ� ����
	boolean push(int val); // ������ ��(top)�� ����� �Ǽ� ����
}