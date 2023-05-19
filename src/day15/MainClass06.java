package day15;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainClass06 {
	public static void main(String[] args) throws Exception {
		TestClass06 t = new TestClass06();
		t.setName("홍길동");
		t.setAge(20);
		
//		File path = new File("c:/test/test.txt");
		FileOutputStream fos = new FileOutputStream(CommonPath.PATH);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(t);
		
		oos.close(); bos.close(); fos.close();
	}
}
