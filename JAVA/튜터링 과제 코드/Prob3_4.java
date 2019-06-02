package tutoring;

// 엉망진창

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Prob3_4 {
	public static void main(String[] args) {
		FileReader in = null; // 파일 읽기용
		FileWriter out = null; // 파일 저장하기(쓰기)용
		String line;
		String printline = "";
		String[] line_array;
		HashMap<String, Integer> Point = new HashMap<String, Integer>();
		Set<String> keys;
		try {
			in = new FileReader("c:\\temp\\test.txt");
			out = new FileWriter("c:\\temp\\out.txt");
			boolean flag = false;
			Scanner fScanner = new Scanner(in);
			while (fScanner.hasNext()) {
				line = fScanner.nextLine();
				line_array = line.split(" ");

				if (Point.isEmpty()) {
					Point.put(line_array[0], Integer.parseInt(line_array[1]));
					printline = "(" + line_array[0] + "," + Integer.parseInt(line_array[1]) + ")";
					System.out.println(printline);
					continue;
				}
				
				keys = Point.keySet();

				Iterator<String> it = keys.iterator();

				while (it.hasNext()) {
					String key = it.next();

					if (key.equals(line_array[0])) {
						int renewPoint = Point.get(key) + Integer.parseInt(line_array[1]);
						Point.put(key, renewPoint);
						flag = true;
						break;
					}
				}
				//System.out.println("안같다!");
				if(!flag) {
					//System.out.println("추가되었음");
					Point.put(line_array[0], Integer.parseInt(line_array[1]));
				}
				
				keys = Point.keySet();
				Iterator<String> it2 = keys.iterator();

				while(it2.hasNext()) {
					String key = it2.next();
					int value = Point.get(key);
					printline = "(" + key + "," + value + ")";
					System.out.print(printline);
				}
	
				System.out.println(" ");
				flag = false;
			}
			
			keys = Point.keySet();
			Iterator<String> it2 = keys.iterator();

			while(it2.hasNext()) {
				String key = it2.next();
				int value = Point.get(key);
				printline = "(" + key + "," + value + ")";
				out.write(printline, 0, printline.length());
				out.write("\r\n", 0, 2);
			}
			
			out.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}

}
