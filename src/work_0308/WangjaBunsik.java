package work_0308;

public class WangjaBunsik extends Bonsa {
	
	@Override
	public void address() {
		setName("왕자분식");
		setDistrict("주택가");
		setNo(1);
		
		System.out.println("================================================");
		System.out.println("\t\t◆ "+getName()+" 메뉴판 ◆");
		System.out.println("\t~ 저희 가게는 "+getDistrict()+"에 위치한 매장 "+getNo()+"호점입니다 ~");
		System.out.println("------------------------------------------------");
	}
	@Override
	public void menuPrice() {
		setKimchi(4500);
		setBoodae(5000);
		setBibibbob(6000);
		setRice(1000);
		
		System.out.printf("\t\t1.김치찌개: %,d\n ",getKimchi(),"원");
		System.out.printf("\t\t2.부대찌개: %,d\n ",getBoodae(),"원");
		System.out.printf("\t\t3.비빔밥: %,d\n ",getBibibbob(),"원");
		System.out.println("\t\t4.순대국: 판매하지 않음");
		System.out.printf("\t\t5.공기밥: %,d\n ",getRice(),"원");
		System.out.println("------------------------------------------------");
	}
}
