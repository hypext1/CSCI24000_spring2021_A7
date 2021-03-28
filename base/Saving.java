public class Saving extends Checking{
	
	protected double rate;
	protected double time;
	public static void main(String[] args){
		Saving a2 = new Saving();
		a2.setMoney(20);
		a2.setRate(0.02);
		a2.interest(10);
		System.out.println(a2.getMoney());
	}

	public Saving(){
		this.rate = 0;
	}

	public Saving(double r){
		this.rate = r;
	}

	public void setRate(double r){
		this.rate = r;
	}

	public double getRate(){
		return this.rate;
	}

	public void interest(int time){
		this.money = this.money * (1 + this.rate * this.time);
	}
}
