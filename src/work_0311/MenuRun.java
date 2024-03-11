package work_0311;

import java.util.Scanner;

/*
	김승철: 두부조림, 바나나, 우유
	유아영: 미역국, 요플레, 바나나, 아몬드
	송민우: 두부조림, 미역국, 우유
	윤지영: 미역국, 요플레, 바나나, 우유, 아몬드
*/
public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LunchMenu[] menu = {new Kid1(),new Kid2(),new Kid3(),new Kid4()};
		String[] name = {"김승철","유아영","송민우","윤지영"};
		
		while(true) {
			System.out.println("\n확인하고 싶은 원생 번호를 입력해주세요.");
			System.out.print("1. 김승철, 2. 유아영, 3. 송민우, 4. 윤지영 > ");
			int kid = sc.nextInt();
				if(kid <= 0 || kid > 4) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
			System.out.println("====================================");
			System.out.println("\t*"+name[kid-1]+" 원생의 오늘의 점심 메뉴*");
			System.out.println("\t  기본 제공: 밥, 불고기");
			System.out.printf("\t  기본 식대: %,d\n ",menu[kid-1].basic());
			System.out.println("------------------------------------");
			System.out.println("\t  추가한 메뉴 확인");
			menu[kid-1].dubujorimAdd();
			menu[kid-1].miyeokgukAdd();
			menu[kid-1].yoplereAdd();
			menu[kid-1].bananaAdd();
			menu[kid-1].milkAdd();
			menu[kid-1].almondAdd();
			System.out.println("------------------------------------");
			System.out.printf("\t  총 식대: %,d\n ",menu[kid-1].total());
			System.out.println("====================================");
			
			System.out.print("다른 원생도 확인하시겠습니까? (Y/N)> ");
			String ans = sc.next().toUpperCase();
			if(ans.equals("N")) {
				System.out.println("\n종료합니다.");
				break;
			}
			else continue;
			}
		sc.close();
		}
	}