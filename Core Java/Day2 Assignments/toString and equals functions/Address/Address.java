
public class Address {

	private String city_name;
	private String state;
	private String pincode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(String city_name, String state, String pincode) {
		super();
		this.city_name = city_name;
		this.state = state;
		this.pincode = pincode;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public void display() {
		System.out.println("City Name "+city_name+"\tState : "+state+"\tPincode : "+pincode);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return city_name+"\t"+state+"\t"+pincode;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Address address = (Address)obj;
		return this.getCity_name().equals(address.getCity_name()) &&
				this.getState().equals(address.getState()) &&
				this.getPincode().equals(address.getPincode());
	}
}
