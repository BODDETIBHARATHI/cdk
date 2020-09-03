
public class StudentManipulation {

	
	 public Student[] createStudents() {
		 Student[] students = new Student[5];
         students[0] = new Student("Manasa", 2, 20, "B", new int[] {70,60,80}) ;
         students[1] = new Student("Durga", 3, 21, "A", new int[] {50,60,70});
         students[2] = new Student("Tarani", 4, 21, "B", new int[] {80,65,75});
         students[3] = new Student("Bhavani", 5, 20, "A", new int[] {50,50,50});
         students[4] = new Student("Sindu", 6, 21, "B", new int[] {80,60,70});
	
         
         return students;
     }
	 
	 public int total(Student students) {
		 int totalMarks = 0;
		 for( int tm : students.getMarks()) {
			 totalMarks += tm;
		 }
		 return totalMarks;
	 }
	 Student findMax(Student students[]) {
		 int max = 0;
		 Student maxStudent = new Student();
		 for(Student stu:students) {
			 int totalStudentMarks = total(stu);
			 stu.setTotal(totalStudentMarks);
			 if(totalStudentMarks > max)
				 maxStudent = stu;
		 }
		 return maxStudent;
	 }
	
}
