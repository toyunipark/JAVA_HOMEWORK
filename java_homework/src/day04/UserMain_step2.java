package day04;

import java.util.Scanner;

/*Id,Pw, 이름, 생년월일을 입력받아,
입력받은 사용자 정보를 출력하는 프로그램

[step1]
1) 조건
- 사용자 정보의 전체 갯수= 3
- 사용자 정보 출력시, 배열명으로만 사용
- 사용자 정보 입력 할 값(임의로 지정)
- 사용자 정보를 저장할 클래스: User
- 매개변수 생성자 사용하기
- toString( )오버라이딩 하기

[step2]
사용자 정보를 입력받을 갯수까지 사용자한테
입력받아, 사용자 정보 저장하기
- 디폴트 생성자 사용하기 */

public class UserMain_step2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int userCount;
		System.out.println("몇 명의 정보를 입력하시겠습니까?");
		userCount=sc.nextInt();
		
		UserStepTwo users[]=new UserStepTwo[userCount];
		
		for (int i=0;i<users.length;i++) {
			users[i]=new UserStepTwo();
		}	
		
		for (int i=0;i<users.length;i++) {
			System.out.println(i+1+"번째 회원의 ID를 입력하세요.");
			users[i].id=sc.next();

			System.out.println(i+1+"번째 회원의 PW를 입력하세요.");
			users[i].pw=sc.next();

			System.out.println(i+1+"번째 회원의 이름을 입력하세요.");
			users[i].name=sc.next();

			System.out.println(i+1+"번째 회원의 생년월일을 입력하세요.");
			users[i].bday=sc.next();
		}
		
		for(int i=0;i<users.length;i++) {
			System.out.println(users[i]);
		}
	}

}

class UserStepTwo{
	String id;
	String pw;
	String name;
	String bday;

	public UserStepTwo(String id, String pw, String name, String bday) {  // 매개변수
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.bday = bday;
	}

	public UserStepTwo() {
	}

	@Override
	public String toString() {
		return "\nUser's ID : " + id + "\nUser's PW : " + pw + "\nUser's Name : " + name + "\nUser's Birthday : " + bday;
	}
	
	
}