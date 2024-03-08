package work_0307;

/*17. 16번 문제에서는 Printer 객체를 생성하고 println() 메소드를 생성했습니다.
Printer 객체를 생성하지 않고 printerExample 클래스에서 다음과 같이 호출하려면
Printer 클래스를 어떻게 수정하면 될까요?*/
public class Printer2 {
	
	public static void println(int ten) {
		System.out.println(ten);
	}
	public static void println(boolean res) {
		System.out.println(res);
	}
	public static void println(double fiveSeven) {
		System.out.println(fiveSeven);
	}
	public static void println(String name) {
		System.out.println(name);
	}
}
