package ProjectGeometri;

public class Rectangle {

	private double base, hight;	

	//CONSTRUCTOR
	public Rectangle (double base , double hight) {
		this.base=base;
		this.hight=hight;
	}

	//GETTERS AND SETTERS
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base=base;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight=hight;
	}

	//METHOD AREA
	public double area() {
		double area = base * hight;
		return area;
	}
	
	//METHOD PERIMETER
	public double perimeter() {
		double perimeter = 2 *(base + hight);
		return perimeter ;
	}
}



