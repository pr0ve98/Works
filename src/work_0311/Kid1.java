package work_0311;

public class Kid1 implements LunchMenu {
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
	public void miyeokgukAdd() {}

	@Override
	public void yoplereAdd() {}

	@Override
	public void bananaAdd() {
		System.out.printf("\t바나나\t %,d\n",BANANA);
		total += BANANA;
	}

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
