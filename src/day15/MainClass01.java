package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass01 {
	public static void main(String[] args) throws FileNotFoundException {
//		String path = "C:\\test\\test.txt";
		File path = new File("C:\\test\\aaa.txt");
//		path.mkdir();
		path.delete();
//		FileOutputStream fos = new FileOutputStream(path);
	}
}
