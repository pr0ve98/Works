package work_0313;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, idOk, ans = "";
		boolean run = true;
		
		System.out.println();
		
		while(run) {
			for(int i=0; i<3; i++) {
				System.out.print("사용할 ID를 입력하세요.> ");
				id = sc.next();
				if(id.length() >= 4 && id.length() <= 20) {	
					idOk = id;
					System.out.println("==> 입력된 아이디 "+idOk+"는 사용하실 수 있습니다.");
					System.out.println(idOk+" 로그인 되었습니다.");
					return;
				}
				else {
					System.out.println("==> 입력된 아이디 "+id+"는 사용하실 수 없습니다.");
					if(i == 2) break;
				}
				
				while(true) {
					System.out.print("계속 하시겠습니까? (Y/N)> ");
					ans = sc.next();
					if(ans.toUpperCase().equals("Y")) break;
					else if(ans.toUpperCase().equals("N")) {
						System.out.println("종료합니다.");
						return;
					}
					else System.out.println("잘못 입력했습니다. 다시 입력하세요.");
				}
			}
			System.out.println("지금부터 20초 사용이 제한됩니다.");
			for(int j=0; j<10; j++) {
				try {Thread.sleep(2000);}
				catch (InterruptedException e) {}
				System.out.print("!!!! ");
			}
			System.out.println("\n20초 제한이 풀렸습니다.");
			System.out.println();
			
		run = false;
		sc.close();
		}
	}
}
