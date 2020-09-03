
public class EnggStudent extends Student{

	private String stream;
	private String collegeName;
	
	public EnggStudent() {
		// TODO Auto-generated constructor stub
		this.stream = "CSE";
		this.collegeName = "SMEC";
	}

	public EnggStudent(int rollNumber, String name,String stream, String collegeName) {
		super(rollNumber,name);
		this.stream = stream;
		this.collegeName = collegeName;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
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
		return stream + "\t" +collegeName;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		EnggStudent eng = (EnggStudent)obj;
		return super.equals(eng) &&
				this.getStream().equals(eng.getStream()) && 
				this.getCollegeName().equals(eng.getCollegeName());
	}
}
