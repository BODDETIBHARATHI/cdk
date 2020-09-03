/*
Assignment 3:
define a hierary as 
         Student rollno,name
         toString()
             
EnggStudent   		  BscStudent      	 	  CommerceStudent
stream         		specialization    		 major subject
collageName       		collageName        		 collageName
display info using toString display info using toString      display info using toString 


TestStudents
public static boolean search(Student[]stucents,Student student)
{

}

main function
{
 create an array of type student
 to the array add 7 objects   3 of type EnggStudent, 2 BScstudent, 2 CommerceStudent

 Create an object of Commercestudent having same value as declare above
 perform a search to find the object whose all datamembers are matching using search method

 Create an object of Enggstudent having different value as declare above
 perform a search to find the object whose all datamembers are matching using search method
}

*/

public class Student {

	private int rollNumber;
	private String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}


	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNumber+"\t"+name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student eng = (Student)obj;
		return this.getRollNumber()==(eng.getRollNumber()) &&
				this.getName().equals(eng.getName());
	}
}
