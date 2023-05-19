package member;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileService implements CommonService {
	private File path;
	private FileOutputStream fos;
	private BufferedOutputStream bos;
	private ObjectOutputStream oos;
	
	private FileInputStream fis;
	private BufferedInputStream bis;
	private ObjectInputStream ois;
	
	public void inputData(MemberDTO dto){
//		File path = new File(PATH+dto.getName()+".txt");
		try {
			fos = new FileOutputStream(path);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null) oos.close();
				if(bos != null) bos.close();
				if(fos != null) fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public boolean checkUser(String name) {
		path = new File(PATH + name + ".txt");
		return path.exists();
	}
	
	public MemberDTO readDate(String name) {
		MemberDTO dto = null;
		try {
			fis = new FileInputStream(path);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			dto = (MemberDTO)ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois != null) ois.close();
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
}
