package work_0311;

public interface LunchMenu {
	int RICE = 500;
	int BULGOGI = 2000;
	int DUBUJORIM = 1000;
	int MIYEOKGUK = 1000;
	int YOPLERE = 800;
	int BANANA = 500;
	int MILK = 500;
	int ALMOND = 700;
	
	int basic();
	void dubujorimAdd();
	void miyeokgukAdd();
	void yoplereAdd();
	void bananaAdd();
	void milkAdd();
	void almondAdd();
	int total();
	
}
