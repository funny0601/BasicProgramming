import java.util.Calendar;

public class Ex6_5 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int hour=now.get(Calendar.HOUR);
		int minute=now.get(Calendar.MINUTE);
		int hour_24=now.get(Calendar.HOUR_OF_DAY);
		System.out.println("���� �ð��� "+hour+"�� "+minute+"���Դϴ�.");
		if (hour_24>4 && hour_24<12)
			System.out.println("Good Morning");
		else if (hour_24>=12&& hour_24<18)
			System.out.println("Good Afternoon");
		else if (hour_24>=18  && hour_24<22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}

}
