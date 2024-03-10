package work_0307;

import java.util.Scanner;

public class BankRun {
	static BankVO[] bankVOArray = new BankVO[100];
	static BankService service = new BankService();
	static Scanner sc = new Scanner(System.in);
	static BankVO vo = new BankVO();
	
	public static void main(String[] args) {
		int cnt = 0;
		boolean run = true;
		while(run) {
			System.out.println("===========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("===========================================");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				vo = new BankVO();
				BankService.createAccount(bankVOArray, cnt);
				bankVOArray[cnt] = vo;
				cnt++;
			}
			else if(selectNo == 2) {
				BankService.accountList(bankVOArray, cnt);
			}
			else if(selectNo == 3) {
				BankService.deposit(bankVOArray, cnt);
			}
			else if(selectNo == 4) {
				BankService.withdraw(bankVOArray, cnt);
			}
			else if(selectNo == 5) {
				System.out.println("\n프로그램을 종료합니다.");
				run = false;
			}
			else System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
		
		}
		sc.close();
	}
}
