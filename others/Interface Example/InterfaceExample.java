interface Shape {
	void setValue();
	void calculateArea();
}

public class Circle implements Shape {
	private int radius;
	final double PI 3.14;
	private double area;
	
	@Override
	public void setValue(int radius) {
			this.radius = radius;
	}
	
	@Override
	public void calculateArea() {
		area = PI * r * r;
		System.out.printf("Area of circle is %f \n", area);
	}
}

public class Rectangle implements Shape {
	private int length;
	private int breath;
	
	@Override
	public void setValue(int length, int breath) {
		this.length = length;
		this.breath = breath;
	}
	
	@Override
	public void calculateArea() {
		area = length*breath;
		System.out.printf("Area of rectangle is %f \n", area);
	}
}

public class Main {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setValue(5);
		c.calculateArea();
		
		Rectangle r = new Rectangle();
		r.setValue(11, 7);
		r.calculateArea();
	}
}
