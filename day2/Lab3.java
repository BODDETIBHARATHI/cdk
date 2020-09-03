import java.util.Scanner;

class Emp{
	private  int empno;
	private String ename;
	private double salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class Lab3 {

	public static void create(){
		int count = 999999;
		Emp[] arr = new Emp[count];

		for(int i=1;i<=count;i++)
		{
			arr[i-1] = new Emp();
			arr[i-1].setEmpno(i);
			arr[i-1].setEname("Nameof"+i);
			arr[i-1].setSalary(i * 1000);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("In Main before starting, enter a number to close");
		scanner.nextInt();
		
		create();
		
		System.out.println("In Main before gc, enter a number to run gc");
		scanner.nextInt();
	//	System.gc();
		
		
		create();
		
		
		System.out.println("In Main before closing, enter a number to close");
		scanner.nextInt();
	
	}

}
