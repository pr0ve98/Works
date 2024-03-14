package work_0314;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sw = true;
				
		while(sw) {
			System.out.println("=====================================================================");
			System.out.println("1. 전체 명단 | 2. 장기회원명단 | 3. 최근 한달 회원명단 | 4. 오늘 등록한 회원명단 | 5. 종료");
			System.out.print("====================================> 확인할 정보를 입력하세요.> ");
			int ans = sc.nextInt();
			switch(ans) {
				case 1: Service.list(); break;
				case 2: Service.longTerm(); break;
				case 5: System.out.println("종료합니다."); break;
				default: System.out.println("잘못 입력하셨습니다.");
				
			}
		}
		sw = false;
		sc.close();
	}
}
