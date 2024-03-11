package work_0311;

public class Kid2 implements LunchMenu {
	int total = 2500;

	@Override
	public int basic() {
		return total;
	}

	@Override
	public void dubujorimAdd() {}

	@Override
	public void miyeokgukAdd() {
		System.out.printf("\t미역국\t %,d\n",MIYEOKGUK);
		total += MIYEOKGUK;		
	}

	@Override
	public void yoplereAdd() {
		System.out.printf("\t요플레\t %,d\n",YOPLERE);
		total += YOPLERE;		
	}

	@Override
	public void bananaAdd() {
		System.out.printf("\t바나나\t %,d\n",BANANA);
		total += BANANA;
	}

	@Override
	public void milkAdd() {}

	@Override
	public void almondAdd() {
		System.out.printf("\t아몬드\t %,d\n",ALMOND);
		total += ALMOND;
	}

	@Override
	public int total() {
		return total;
	}

}
