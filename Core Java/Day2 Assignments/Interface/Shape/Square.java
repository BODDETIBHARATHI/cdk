
public class Square extends Shape1 implements Calculation {

	private int length;
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	public Square(int length) {
		super("Square");
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * length;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4 * length;
	}

}
