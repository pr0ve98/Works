package work_0307;

/*16. PrinterExample 클래스에서 Printer 객체를 생성하고 printer()
메소드를 호출해서 매개값을 콘솔에 출력하려고 합니다.
printer() 메소드의 매개값으로는 int, boolean, double, String 값을 줄 수 있습니다.
Printer 클래스에서 println() 메소드를 선언해보세요.*/

public class Printer {

	public void println(int ten) {
		System.out.println(ten);
	}
	public void println(boolean res) {
		System.out.println(res);
	}
	public void println(double fiveSeven) {
		System.out.println(fiveSeven);
	}
	public void println(String name) {
		System.out.println(name);
	}
}
