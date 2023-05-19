package user;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num,level = 0;
		String nickname = null, ID = null;
		userDTO dto = null;
		userService us = new userService();
		while(true) {
			System.out.println("1.유저등록");
			System.out.println("2.유저검색");
			System.out.println("3.종료");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1 : 
				System.out.print("아이디 : "); 
				ID = input.next();
				if(us.checkUser(ID)) {
					System.out.println("등록된 유저입니다.");
					break;
				}
				System.out.print("닉네임 : ");
				nickname = input.next();
				System.out.print("레벨 : ");
				level = input.nextInt();
				dto = new userDTO();
				dto.setID(ID);dto.setLevel(level);dto.setNickname(nickname);
				us.save(dto);
				break;
			case 2 : 
				System.out.print("아이디 : ");
				ID = input.next();
				if(us.checkUser(ID) == false) {
					System.out.println("등록되지 않은 유저입니다.");
					break;
				}
				dto = us.getUser(ID);
				System.out.println("아이디 : " + dto.getID());
				System.out.println("닉네임 : " + dto.getNickname());
				System.out.println("레벨 : " + dto.getLevel());
				break;
			case 3 : System.out.println("종료합니다.");return;
			}
			
		}
	}
}
