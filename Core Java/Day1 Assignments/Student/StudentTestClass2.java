
public class StudentTestClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student[] students = new Student[5];
         students[0] = new Student("Manasa", 2, 20, "B", new int[] {70,60,80}) ;
         students[1] = new Student("Durga", 3, 21, "A", new int[] {50,60,70});
         students[2] = new Student("Tarani", 4, 21, "B", new int[] {80,65,75});
         students[3] = new Student("Bhavani", 5, 20, "A", new int[] {50,50,50});
         students[4] = new Student("Sindu", 6, 21, "B", new int[] {80,60,70});
	
         
         System.out.println("Students Array started");
         for(Student s : students) {
      	   System.out.println("Student name = "+s.getName());
      	   System.out.println("Student identifier = "+s.getIdentifier());
      	   System.out.println("Student age = "+s.getAge());
      	   System.out.println("Student standard = "+s.getStandard());
      	   System.out.println("Student marks = "+s.getMarks());
         }
         System.out.println("Student Array ended");
	}
}
