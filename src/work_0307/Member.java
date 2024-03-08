package work_0307;
/*13. 현실 세계의 회원을 Member 클래스로 모델링하려고 합니다. 회원의 데이터로는 이름, 아이디, 패스워드, 나이가 있습니다
이 데이터들이 가지는 Member 클래스를 선언해보세요.

14.위에서 작성한 Member 클래스에 생성자를 추가하려고 합니다. 다음과 같이 Member 객체를 생성할 때 name 필드와 id 필드를
외부에서 받은 값으로 초기화하려면 생성자를 어떻게 선언해야 합니까?

Member user1 = new Member("홍길동","hong");
Member user2 = new Member("김자바","java");*/

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member(String name, String id) {}
}
