package work_0307;

public class Work2 {
public static void main(String[] args) {
		
		// 1~45까지의 숫자 중 6개의 수를 추출 후 정렬해 출력시켜보자(중복 배제)
		
		int[] lotto = new int[6];
		int temp = 0;
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			System.out.print(lotto[i]+" ");
		}
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				if(lotto[i-1] > lotto[j]) {
				temp = lotto[i-1];
				lotto[i-1] = lotto[j];
				lotto[j] = temp;
				}
			}
		}
		System.out.println();
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" / ");
		}
	}
}
