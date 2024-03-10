package work_0308;

public abstract class Bonsa {
	private int no;
	private String name;
	private String district;
	private int kimchi;
	private int boodae;
	private int bibibbob;
	private int soondae;
	private int rice;
	
	// 추상 메소드
	public abstract void address();
	public abstract void menuPrice();
	
	// Setter Getter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getKimchi() {
		return kimchi;
	}
	public void setKimchi(int kimchi) {
		this.kimchi = kimchi;
	}
	public int getBoodae() {
		return boodae;
	}
	public void setBoodae(int boodae) {
		this.boodae = boodae;
	}
	public int getBibibbob() {
		return bibibbob;
	}
	public void setBibibbob(int bibibbob) {
		this.bibibbob = bibibbob;
	}
	public int getSoondae() {
		return soondae;
	}
	public void setSoondae(int soondae) {
		this.soondae = soondae;
	}
	public int getRice() {
		return rice;
	}
	public void setRice(int rice) {
		this.rice = rice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
