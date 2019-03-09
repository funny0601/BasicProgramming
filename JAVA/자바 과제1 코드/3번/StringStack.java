public class StringStack implements Stack {
	private int[] element = new int[10]; 
	private int tos=-1; 
	
	
	@Override
	public int length() { 
		return tos+1;
	}
	
	@Override
	public int capacity() { 
		return element.length;
	}
	
	@Override
	public int pop() {
		if(tos == -1) 
			System.out.println("저장된 값이 없습니다.");
		int a = element[tos];
		tos--;
		return a;
	}

	@Override
	public boolean push(int val) {
		if(tos == element.length-1)
			return false;
		else {
			tos++;
			element[tos] = val;
				if(tos == element.length-1) {
					return false;
				}
			return true;
		}
	}
}