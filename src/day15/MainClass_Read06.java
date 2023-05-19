package day15;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class MainClass_Read06 {
	public static void main(String[] args) throws Exception {
//		File path = new File("c:/test/test.txt");
		FileInputStream fis = new FileInputStream(CommonPath.PATH);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
//		Object o = ois.readObject();
//		TestClass06 t = (TestClass06)o;
		TestClass06 t = (TestClass06)ois.readObject();
		System.out.println("이름 : " + t.getName());
		System.out.println("나이 : " + t.getAge());
		ois.close(); bis.close(); fis.close();
	}
}
