
public class CommerceStudent extends Student {

	private String majorStudent;
	private String collegeName;
	
	public CommerceStudent() {
		// TODO Auto-generated constructor stub
	}

	public CommerceStudent(int rollNumber, String name,String majorStudent, String collegeName) {
		super(rollNumber,name);
		this.majorStudent = majorStudent;
		this.collegeName = collegeName;
	}

	public String getMajorStudent() {
		return majorStudent;
	}

	public void setMajorStudent(String majorStudent) {
		this.majorStudent = majorStudent;
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
		return majorStudent + "\t" +collegeName;
	}
	
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CommerceStudent com = (CommerceStudent)obj;
		return super.equals(com) &&
				this.getMajorStudent().equals(com.getMajorStudent()) && 
				this.getCollegeName().equals(com.getCollegeName());
	}
}
