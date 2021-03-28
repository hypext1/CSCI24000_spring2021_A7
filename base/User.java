public class User{
	protected String num;
	protected String pin;
	protected String accType;

	public static void main (String[] args){
		User u1 = new User();
		u1.setNum("00001");
		u1.setPin("22222");
		u1.setType("Saving");
		System.out.println(u1.getType());
	}

	public User(){
		this.num = "00001";
		this.pin = "12345";
		this.accType = "Checking";
	}

	public User(String n, String p, String c){
		this.num = n;
		this.pin = p;
		this.accType = c;
	}
	
	public void setNum(String n){
		this.num = n;
	}

	public String getNum(){
		return this.num;
	}

	public void setPin(String p){
		this.pin = p;
	}

	public String getPin(){
		return this.pin;
	}
	
	public void setType(String t){
		this.accType = t;
	}

	public String getType(){
		return accType;
	}
}
