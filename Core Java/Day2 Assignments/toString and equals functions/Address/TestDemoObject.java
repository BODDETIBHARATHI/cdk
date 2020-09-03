
public class TestDemoObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address = new Address("Hyderabad", "Telangana", "1234");
		System.out.println(address.toString());
		
		Address address1 = new Address("Hyderabad", "Telangana", "1234");//address;--equal//new Address("Hyderabad", "Telangana", "1234");
		//find equalization od addresses
		if(address.equals(address1))//here we are comparing address
			System.out.println("equal");
		else
			System.out.println("not equal");
	}

}
