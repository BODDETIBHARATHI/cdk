
public class TestStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student[] = new Student[7];
		student[0] = new EnggStudent(1,"Bharathi","CSE", "MLR");
		student[1] = new EnggStudent(2,"Manasa","ECE", "CMR");
		student[2] = new EnggStudent(3,"Surya","CIVIL", "KLU");
		student[3] = new BscStudent(4,"Ganesh","BTECH", "JNTUH");
		student[4] = new BscStudent(5,"Venkat","MTECH", "OU");
		student[5] = new CommerceStudent(6,"Durga","MTECH", "OU");
		student[6] = new CommerceStudent(7,"Bhavani","CSE", "JNTUH");
		
		Student engstu = new EnggStudent(1,"Bharathi","CSE", "MLR");
		if(search(student,engstu))
		{
			System.out.println("Engineering Student Found");
		}
		else
		{
			System.out.println("Engineering student not Found");
		}
		Student commstu = new CommerceStudent(8,"Bhavani","CSE", "JNTUH");
		if(search(student,commstu))
		{
			System.out.println("Commerce student Found");
		}
		else
		{
			System.out.println("Commerce student not Found");
		}
		
	}
	

	public static boolean search(Student[] students,Student student)
	{
		for(Student mystudent:students)
		{
			if (mystudent.getClass()==student.getClass())
			{
				if(mystudent.equals(student))
					return true;
			}
		}
		
        return false;
	}
	
}
/*
System.out.println("Search result "+search(student,engstu));
System.out.println("instance of "+ (engstu instanceof EnggStudent));

*/
