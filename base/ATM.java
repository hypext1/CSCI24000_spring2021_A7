import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class ATM{
	
	public static void main(String[] args){
		ArrayList<User> list = new ArrayList<User>();
		//account list
		list.add(new User("44444","33333","checking"));
		list.add(new User("55555","12345","saving"));

		//ui
		System.out.println("enter account number: ");
		String n = System.console().readLine();
		for (int i = 0; i < list.size(); i++){
			if (Objects.equals(n,list.get(i).getNum())){
				System.out.println("enter pin: ");
				String p = System.console().readLine();
				if (Objects.equals(p,list.get(i).getPin())){
					System.out.println(list.get(i).getType());
				}
			}
		}
	}
}
