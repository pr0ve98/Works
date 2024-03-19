package work_0319;

public class T1_MultiThreadRun {
	public static void main(String[] args) {
		T1_MultiThread ex = new T1_MultiThread();
		
		Thread th1 = new Thread(ex, "1번마");
		Thread th2 = new Thread(ex, "2번마");
		Thread th3 = new Thread(ex, "3번마");
		Thread th4 = new Thread(ex, "4번마");
		Thread th5 = new Thread(ex, "5번마");
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		
	}
}
