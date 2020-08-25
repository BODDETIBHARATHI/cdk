
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		WageEmployee w = new WageEmployee();
//		w.display();//It is a method of Employee but we can access it through child class by using inheritance
////		
//		WageEmployee w1 = new WageEmployee(404,"CDK",201,9);//parent then child then grand-child values
//		w1.display();
		
		
		//Employee emp = new Employee(); --------- gives error because we used 'abstract' keyword for Employee class
		
         SalariedEmployee se = new SalariedEmployee(1,"Bharathi", 1000, 700, 500);		
         se.display();
         
        long totalSal = se.totalSalary();
		System.out.println("Total Salary = "+totalSal);
	}

}
