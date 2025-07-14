
public class Encap {
	
	private int acc;
	private String name;
	private double amount;
	
	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	

	public static void main(String[] args) {
		
		
		Encap ec= new Encap();
		ec.setAcc(100);
		int x= ec.getAcc();
		System.out.println(x);

	}

}
