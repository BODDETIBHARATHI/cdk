
public class FinalStudent {

	public static void main(String[] args) {
		StudentManipulation sm = new StudentManipulation();
		Student students[] = sm.createStudents();
		for(Student stu:students) {
			stu.display();
		}
		System.out.println("\n------------------------------");
		for(Student st:students) {
			System.out.println("\nTotal marks of "+st.getName()+" = "+st.getTotal());
		}
		System.out.println("--------------------------------");
		System.out.println("Student with maximum marks: ");
		Student maxStudent = sm.findMax(students);
		maxStudent.display();
	}
}
