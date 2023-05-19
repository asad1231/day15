package member;

public class MemberService {
	private FileService fs;
	public MemberService() {
		fs = new FileService();
	}
	public void save(MemberDTO dto) {
		fs.inputData(dto);
	}
	public boolean checkUser(String name) {
		return fs.checkUser(name);
	}
	public MemberDTO getMember(String name) {
		return fs.readDate(name);
	}
}
