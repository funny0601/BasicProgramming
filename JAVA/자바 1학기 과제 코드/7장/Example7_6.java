import java.util.*;
class Location {
	private String city;
	private double longitude; // 경도
	private double latitude; // 위도
	
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
		//도시 입력받기
		System.out.println("도시,경도,위도를 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			text = scanner.nextLine();
			st = new StringTokenizer(text, ",");
			city = st.nextToken().trim();
			logitude = Double.parseDouble(st.nextToken().trim());
			latitude = Double.parseDouble(st.nextToken().trim());			
			loc = new Location(city, logitude, latitude);
			dept.put(city, loc); //해시맵에 저장
		}			
		
		// 도시 출력하기
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		while (it.hasNext()) {
			city = it.next(); // 도시 이름 알아냄
			loc = dept.get(city); // 도시 이름을 키로하여 해시맵에서 Location 객체 얻어냄

			System.out.print(loc.getCity() + "\t");
			System.out.print(loc.getLongitude() + "\t");
			System.out.println(loc.getLatitude());
		}
		System.out.println("---------------------------");		
		
		// 도시이름으로 검색하기
		while(true) {
			System.out.print("도시 이름 >> ");
			city = scanner.nextLine(); // 도시 이름 입력
			if(city.equals("그만"))
				return; // 종료
			
			loc = dept.get(city); // 해시맵에서 도시를 키로 검색
			if(loc == null) { // 도시가 해시맵에 없다면
				System.out.println(city + "는 없습니다.");
			}
			else { // 해시맵에서 검색된  Student 객체
				System.out.print(loc.getCity()  + "\t");
				System.out.print(loc.getLongitude() + "\t");
				System.out.println(loc.getLatitude());
			}
		}
	}
}
