
public class Circle extends Shape implements Calculation {

	private int radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		return 3.14*radius*radius;
	}
	public double perimeter() {
		return 2 * 3.14 * radius;
	}
	
	
}
