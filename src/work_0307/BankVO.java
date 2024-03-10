package work_0307;

public class BankVO {
	private String ano;
	private String owner;
	private int balance;
	
	private int balancePlus;
	private int balanceMinus;

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalancePlus() {
		return balancePlus;
	}
	
	public void setBalancePlus(int balancePlus) {
		this.balance += balancePlus;
	}

	public int getBalanceMinus() {
		return balanceMinus;
	}

	public void setBalanceMinus(int balanceMinus) {
		this.balance -= balanceMinus;
	}
	
}
