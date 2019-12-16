package day04;

/*Id,Pw, 이름, 생년월일을 입력받아,
입력받은 사용자 정보를 출력하는 프로그램

[step1]
1) 조건
- 사용자 정보의 전체 갯수= 3
- 사용자 정보 출력시, 배열명으로만 사용
- 사용자 정보 입력 할 값(임의로 지정)
- 사용자 정보를 저장할 클래스: User
- 매개변수 생성자 사용하기
- toString( )오버라이딩 하기*/

public class UserMain_step1 {

	public static void main(String[] args) {
		User users[]={
				new User("ID0A", "1987", "가길동", "2000-01-01"),
				new User("ID0B", "2896", "나길동", "2001-03-19"),
				new User("ID0C", "3217", "다길동", "2002-06-30"),
		};
		for(int i=0;i<users.length;i++) {
			System.out.println(users[i]);
		}
	}

}

class User{
	String id;
	String pw;
	String name;
	String bday;

	public User(String id, String pw, String name, String bday) {  // 매개변수
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.bday = bday;
	}

	@Override
	public String toString() {
		return "\nUser's ID : " + id + "\nUser's PW : " + pw + "\nUser's Name : " + name + "\nUser's Birthday : " + bday;
	}
	
	
}