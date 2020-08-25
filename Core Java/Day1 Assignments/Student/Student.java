/*
Student 
   name, identifier, age, standard, marks obtained in each subject
   public void display(){  }

Testclass1 with main
step1 
   define an object for student and display data

Testclass2 with main
step2
create main2
   define an object array for 5 students and display data


StudentManipulation
{
   Student[] createStudnets(){//}
   int total(Student stu)
   int findmax(Student [] students)   // Student findmax(Student [] students)

}
step 4
main 
   1. grab array from student manipulation
   2. pass element one by one from array to total function to calculate total marks
   3. pass array to findmax in orderto search for student with highest total
*/

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
