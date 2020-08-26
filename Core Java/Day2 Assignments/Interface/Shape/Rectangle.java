
public class Rectangle extends Shape1 implements Calculation {

	private int length, breadth;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	public Rectangle(int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * breadth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + breadth);
	}

}
