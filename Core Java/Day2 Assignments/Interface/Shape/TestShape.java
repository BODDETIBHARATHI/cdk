
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Shape1 c = new Circle1(10);
          Shape1 s = new Square(5);
          System.out.println("Area of "+c.getName()+" : "+((Circle1) c).area());
          System.out.println("Perimeter of "+c.getName()+" : "+((Circle1) c).perimeter());
          System.out.println("Area of "+s.getName()+" : "+((Square) s).area());
          System.out.println("Perimeter of "+s.getName()+" : "+((Square) s).perimeter());
          Rectangle r = new Rectangle(4,5);
          System.out.println("Area of Rectangle : "+r.area());
          System.out.println("Perimeter of Rectangle : "+r.perimeter());
          
          {
        	  
          }
          
	}

}
