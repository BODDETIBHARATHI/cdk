public class Student {
	private String name;
	private int identifier;
	private int age;
	private String standard;
	private int marks[];
    private int total;
    
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Student() {

	}
	public Student(String name, int identifier, int age, String standard, int[] marks) {
		this.name = name;
		this.identifier = identifier;
		this.age = age;
		this.standard = standard;
		this.marks = marks;
	}

	public void display() {
		System.out.println("\nStudent name = " + getName());
		System.out.println("Student identifier = " + getIdentifier());
		System.out.println("Student age = " + getAge());
		System.out.println("Student standard = " + getStandard());
		System.out.print("Student marks = ");
		for (int m : marks)
			System.out.print(m + "\t");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

}
