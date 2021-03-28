public class Checking {
	protected double money;
	
	public static void main(String[] args){
		Checking a = new Checking();
		
		a.setMoney(15);
		System.out.println(a.getMoney());
	}
	
	public Checking(){
		this.money = 0;
	}

	public Checking(int m){
		this.money = m;
	}

	public void setMoney(int m){
		this.money = m;
	}

	public double getMoney(){
		return this.money;
	}
}
