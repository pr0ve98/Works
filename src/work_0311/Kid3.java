package work_0311;

public class Kid3 implements LunchMenu {
	int total = 2500;

	@Override
	public int basic() {
		return total;
	}

	@Override
	public void dubujorimAdd() {
		System.out.printf("\t두부조림\t %,d\n",DUBUJORIM);
		total += DUBUJORIM;
	}

	@Override
	public void miyeokgukAdd() {
		System.out.printf("\t미역국\t %,d\n",MIYEOKGUK);
		total += MIYEOKGUK;	
	}

	@Override
	public void yoplereAdd() {}

	@Override
	public void bananaAdd() {}

	@Override
	public void milkAdd() {
		System.out.printf("\t우유\t %,d\n",MILK);
		total += MILK;
	}

	@Override
	public void almondAdd() {}

	@Override
	public int total() {
		return total;
	}

}
