package user;

public class userService {
	private FileService fs;
	public userService() {
		fs = new FileService();
	}
	public boolean checkUser(String ID) {
		return fs.checkUser(ID);
	}
	public void save(userDTO dto) {
		fs.inputUser(dto);
	}
	public userDTO getUser(String ID) {
		return fs.readUser(ID);
	}
}
