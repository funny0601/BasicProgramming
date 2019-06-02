package tutoring;

import java.util.*;
import java.io.File;

public class Prob3_5 {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\seyoung\\eclipse-workspace\\tutoring\\src\\tutoring");
		File[] subFiles = f1.listFiles();
		int index = 0;
		for(int i=1; i<subFiles.length; i++) {
			File f = subFiles[1];
			if(subFiles[index].length()<=subFiles[i].length()) {
				index = i;
			}
		}
		System.out.println("가장 큰 파일은 "+subFiles[index].getPath()+" "+subFiles[index].length()+"바이트");

	}

}
