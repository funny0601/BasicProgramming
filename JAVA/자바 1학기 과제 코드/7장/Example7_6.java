import java.util.*;
class Location {
	private String city;
	private double longitude; // �浵
	private double latitude; // ����
	
	public Location(String city, double longitude, double latitude) {
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public void setCity(String city) { 
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setLogitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLatitude() {
		return latitude;
	}
}

public class Example7_6 {	
	public static void main (String[] args) {
		HashMap<String, Location> dept = new HashMap<String, Location>();
		Scanner scanner = new Scanner(System.in);
		String text, city;
		StringTokenizer st;
		double logitude, latitude;
		Location loc;
		//���� �Է¹ޱ�
		System.out.println("����,�浵,������ �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			text = scanner.nextLine();
			st = new StringTokenizer(text, ",");
			city = st.nextToken().trim();
			logitude = Double.parseDouble(st.nextToken().trim());
			latitude = Double.parseDouble(st.nextToken().trim());			
			loc = new Location(city, logitude, latitude);
			dept.put(city, loc); //�ؽøʿ� ����
		}			
		
		// ���� ����ϱ�
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		while (it.hasNext()) {
			city = it.next(); // ���� �̸� �˾Ƴ�
			loc = dept.get(city); // ���� �̸��� Ű���Ͽ� �ؽøʿ��� Location ��ü ��

			System.out.print(loc.getCity() + "\t");
			System.out.print(loc.getLongitude() + "\t");
			System.out.println(loc.getLatitude());
		}
		System.out.println("---------------------------");		
		
		// �����̸����� �˻��ϱ�
		while(true) {
			System.out.print("���� �̸� >> ");
			city = scanner.nextLine(); // ���� �̸� �Է�
			if(city.equals("�׸�"))
				return; // ����
			
			loc = dept.get(city); // �ؽøʿ��� ���ø� Ű�� �˻�
			if(loc == null) { // ���ð� �ؽøʿ� ���ٸ�
				System.out.println(city + "�� �����ϴ�.");
			}
			else { // �ؽøʿ��� �˻���  Student ��ü
				System.out.print(loc.getCity()  + "\t");
				System.out.print(loc.getLongitude() + "\t");
				System.out.println(loc.getLatitude());
			}
		}
	}
}
