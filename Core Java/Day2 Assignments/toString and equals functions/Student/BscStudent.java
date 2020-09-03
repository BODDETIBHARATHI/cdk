
public class BscStudent extends Student {

	private String specialization;
	private String collegeName;
	
	public BscStudent() {
		// TODO Auto-generated constructor stub
		this.specialization = "BTECH";
		this.collegeName = "SMEC";
	}

	public BscStudent(int rollNumber, String name,String specialization, String collegeName) {
		super(rollNumber,name);
		this.specialization = specialization;
		this.collegeName = collegeName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return specialization + "\t" +collegeName;
	}
	
}
