package day15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass04 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/test/test.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		for(char i = 'A'; i <= 'B'; i++) {
			Thread.sleep(2000);
//			fos.write(i);
			bos.write(i);
		}
		
		bos.flush();
		bos.write("안녕하세요".getBytes());
		bos.close();
//		bos.write("안녕하세요".getBytes());
		fos.close();
	}
}
