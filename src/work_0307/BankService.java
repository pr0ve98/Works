package work_0307;

public class BankService {
	public static void createAccount(BankVO[] bankVOArray, int cnt) {
		System.out.println("---------");
		System.out.println("계좌 생성");
		System.out.println("---------");
		System.out.print("계좌번호> ");
		BankRun.vo.setAno(BankRun.sc.next());
		System.out.print("계좌주> ");
		BankRun.vo.setOwner(BankRun.sc.next());
		System.out.print("초기입금액> ");
		BankRun.vo.setBalance(BankRun.sc.nextInt());
		System.out.println("결과: 계좌가 생성되었습니다.\n");
	}
	
	public static void accountList(BankVO[] bankVOArray, int cnt) {
		System.out.println("---------");
		System.out.println("계좌 목록");
		System.out.println("---------");
		for(int i=0; i<cnt; i++) {
			System.out.println(bankVOArray[i].getAno()+" | "+bankVOArray[i].getOwner()+" | "+bankVOArray[i].getBalance());
		}
	}
	
	public static void deposit(BankVO[] bankVOArray, int cnt) {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		while(true) {
			for(int i=0; i<=cnt; i++) {
				System.out.print("계좌번호> ");
				if(BankRun.sc.next().equals(bankVOArray[i].getAno())) {
					System.out.print("입금액> ");
					bankVOArray[i].setBalancePlus(BankRun.sc.nextInt());
					System.out.println("결과: 입금이 확인되었습니다");
					System.out.println("현재 잔고> "+bankVOArray[i].getBalance());
				}
				else break;
				System.out.println("해당하는 계좌가 없습니다.");
			}
		}
	}
}
