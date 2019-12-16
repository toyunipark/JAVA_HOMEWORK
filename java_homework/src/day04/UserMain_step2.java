package day04;

import java.util.Scanner;

/*Id,Pw, �̸�, ��������� �Է¹޾�,
�Է¹��� ����� ������ ����ϴ� ���α׷�

[step1]
1) ����
- ����� ������ ��ü ����= 3
- ����� ���� ��½�, �迭�����θ� ���
- ����� ���� �Է� �� ��(���Ƿ� ����)
- ����� ������ ������ Ŭ����: User
- �Ű����� ������ ����ϱ�
- toString( )�������̵� �ϱ�

[step2]
����� ������ �Է¹��� �������� ���������
�Է¹޾�, ����� ���� �����ϱ�
- ����Ʈ ������ ����ϱ� */

public class UserMain_step2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int userCount;
		System.out.println("�� ���� ������ �Է��Ͻðڽ��ϱ�?");
		userCount=sc.nextInt();
		
		UserStepTwo users[]=new UserStepTwo[userCount];
		
		for (int i=0;i<users.length;i++) {
			users[i]=new UserStepTwo();
		}	
		
		for (int i=0;i<users.length;i++) {
			System.out.println(i+1+"��° ȸ���� ID�� �Է��ϼ���.");
			users[i].id=sc.next();

			System.out.println(i+1+"��° ȸ���� PW�� �Է��ϼ���.");
			users[i].pw=sc.next();

			System.out.println(i+1+"��° ȸ���� �̸��� �Է��ϼ���.");
			users[i].name=sc.next();

			System.out.println(i+1+"��° ȸ���� ��������� �Է��ϼ���.");
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

	public UserStepTwo(String id, String pw, String name, String bday) {  // �Ű�����
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