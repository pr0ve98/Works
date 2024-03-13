package work_0313;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("================================");
			System.out.print("속성을 확인할 파일명을 입력하세요.> ");
			String fileName = sc.next();
			if(fileName.indexOf(".") == -1) {
				System.out.println("확장자명까지 적어주십시오."); 
				continue;
			}
			String[] fileNameArrry = fileName.split("\\.");
			String extension = fileNameArrry[1];
			
			fileAnalyze(extension);
			
			System.out.println(fileName+" ==> "+fileAnalyze(extension));
			
			String ans;
			while(true) {
				System.out.print("계속 하시겠습니까? (Y/N)> ");
				ans = sc.next();
				if(ans.toUpperCase().equals("Y") || ans.toUpperCase().equals("N")) break;
				else System.out.println("잘못 입력했습니다. 다시 입력하세요.");
			}
			if(ans.toUpperCase().equals("Y"));
			else if(ans.toUpperCase().equals("N")) {
				System.out.println("프로그램 종료");
				System.out.println("================================");
				break;
			} 
		}
		sc.close();
	}

	public static String fileAnalyze(String extension) {
		
		if(extension.equals("jpg") || extension.equals("jpeg") || extension.equals("png") || extension.equals("gif")) {
			extension = "이미지파일";
		} 
		else if(extension.equals("txt")) {
			extension = "텍스트파일";
		}
		else if(extension.equals("zip")) {
			extension = "압축파일";
		}	
		else if(extension.equals("xlsx")) {
			extension = "엑셀파일";
		}
		else if(extension.equals("hwp")) {
			extension = "한글파일";
		}
		else extension = "알 수 없는 확장자명이거나 잘못된 파일";
		return extension;
	}
}

