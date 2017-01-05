package ProjectGeometri;

public class Circle {
	
	private double radius;
	final double PI = 3.14;
	
	//CONSTRUCTOR
	public Circle(double radius){ 	
		this.radius=radius;
	}

	//GETTERS AND SETTERS
	public double getRadius() {
		return radius;
	}	
	public void setRadius(double radius) {
		this.radius=radius ;
	}

	//METHOD AREA
	public double area() {   
	double area = PI * radius * radius;   
	return area;
	}

//TASK 1
	//METHOD PERIMETER
	public double perimeter() { 
		double perimeter = 2 * PI * radius;
		return perimeter;
	}	
}	

