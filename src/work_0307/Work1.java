package work_0307;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		
		/*
		 * 년도와 달을 입력하여 해당연도 월의 마지막 일자를 출력하는 프로그램을 완성하시오.
		 * 윤년? 4로 나눠떨어지면 윤년? 100으로 나눠떨어지면 평년? 400으로 나눠떨어지면 윤년
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.print("년도를 입력하세요. ");
		int year = sc.nextInt();
		
		System.out.print("마지막 일자를 알고 싶은 월을 입력하세요. ");
		int month = sc.nextInt();
		
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			lastDay[1] = 29;
		}
		
		System.out.println(year+"년의 "+month+"월 마지막 일자는 "+lastDay[month-1]+"일입니다.");
		
		sc.close();
	}
}
