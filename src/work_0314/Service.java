package work_0314;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Service {
	public static LocalDate todayDate = LocalDate.now();
	public static LocalDate oneYear = todayDate.minusYears(1);
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	static String[][] member =
		{{"홍길동", "김말숙","이기자","소나무","아톰맨","에이맨","오하늘",
			"최고봉","으뜸맨","사랑이","감나무","행복맨","가나다","오솔길"}
		,{"2000-1-1", "2020-12-31","2019-5-20","2024-3-14",
		"2022-11-22","2023-12-11","2024-3-14","2021-3-14",
		"2023-5-2","2024-3-13","2022-10-10","2000-12-12",
		"2024-2-28","2024-3-1"}};
	
	public Service() {}
	
	void list() {
		System.out.println("=====================================================================");
		System.out.println("회원명\t\t가입 날짜");
		System.out.println("---------------------------------------------------------------------");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");		
		for(int i=0; i<member[0].length; i++) {
			String dateArray = member[1][i];
			Integer year = new Integer(dateArray.split("-")[0]);
			Integer month = new Integer(dateArray.split("-")[1]);
			Integer day = new Integer(dateArray.split("-")[2]);
			LocalDate targetDate = LocalDate.of(year, month, day);
			targetDate.format(dtf);
			System.out.println(member[0][i]+"\t\t"+targetDate.format(dtf));
		}
//			memberList();
	}
	
	void longTerm() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		System.out.println("=====================================================================");
		System.out.println("회원명\t\t가입 날짜\t\t가입유지 개월수");
		System.out.println("---------------------------------------------------------------------");
		for(int i=0; i<member[0].length; i++) {
			String dateArray = member[1][i];
			Integer year = new Integer(dateArray.split("-")[0]);
			Integer month = new Integer(dateArray.split("-")[1]);
			Integer day = new Integer(dateArray.split("-")[2]);
			LocalDate targetDate = LocalDate.of(year, month, day);
			targetDate.format(dtf);
			
			Period preiod = Period.between(todayDate, targetDate);
			int totalMonth = (preiod.getYears()*-12)+(preiod.getMonths()*-1);
			
			if(targetDate.isBefore(oneYear) == true) {
				System.out.println(member[0][i]+"\t\t"+targetDate.format(dtf)+"\t"+totalMonth+"개월");
			}
		}
	}

//	public static String memberList() {
//		LocalDate targetDate = null;
//		for(int i=0; i<member[0].length; i++) {
//			String dateArray = member[1][i];
//			Integer year = new Integer(dateArray.split("-")[0]);
//			Integer month = new Integer(dateArray.split("-")[1]);
//			Integer day = new Integer(dateArray.split("-")[2]);
//			targetDate = LocalDate.of(year, month, day);
//			targetDate.format(dtf);
//		
//		}
//		return targetDate.format(dtf);
//	}
}
