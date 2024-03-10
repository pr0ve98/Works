package work_0308;

import java.util.Scanner;

public class BunsikRun {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Bonsa priceWangja = new WangjaBunsik();
		Bonsa priceSeoul = new SeoulBunsik();
		Bonsa priceWooju = new WoojuBunsik();

		boolean run = true;

		while(run) {
			System.out.println("================================================");
			System.out.println("\t  ~ 메뉴를 확인할 점포를 적어주세요. ~");
			System.out.print("   1. 왕자분식, 2. 서울분식, 3. 우주분식, 4. 종료> ");
			int choice = sc.nextInt();
				if(choice > 4) System.out.println("\t잘못 입력하셨습니다. 다시 입력하세요.");
			
			switch (choice) {
				case 1:
					priceWangja.address();
					priceWangja.menuPrice();
					break;
					
				case 2:
					priceSeoul.address();
					priceSeoul.menuPrice();
					break;
					
				case 3:
					priceWooju.address();
					priceWooju.menuPrice();
					break;
					
				case 4:
					run = false;
					System.out.println();
					System.out.println("\t\t프로그램 종료");
			}
		}
		sc.close();
	}
}