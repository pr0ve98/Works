package work_0319;

public class T1_MultiThread extends Thread {
	int cnt = 0;

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i+"바퀴째: "+Thread.currentThread().getName());
			cnt++;
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
