package ProjectGeometri;

public class Triangle {

	private double sideOne, sideTwo, sideThree ;

	//CONSTRUCTOR
	public Triangle (double sideOne, double sideTwo, double sideThree) {
		this. sideOne = sideOne;
		this. sideTwo = sideTwo;
		this. sideThree = sideThree;
	}
	
	//GETTERS AND SETTERS
	public double getSideOne () {
		return sideOne;
	}
	public void setSideOne (double sideOne) {
		this.sideOne = sideOne;
	}
	public double getSideTwo () {
		return sideTwo;
	}
	public void setSideTwo (double sideTwo) {
		this.sideTwo = sideTwo;
	}
	public double getSideThree () {
		return sideThree;
	}
	public void setSideThree (double sideThree) {
		this.sideThree = sideThree;
	}
	
	//METHOD AREA
	public double area() {
		double s = (sideOne + sideTwo + sideThree)/2;
		double a = s*(s-sideOne)*(s-sideTwo)*(s- sideThree) ;
		double area ;
		if (a < 0) {
			System.out.println("Invalid triangle!");	
			area = 0.0 ;
			return area ;
		}
		else { 
			area = Math.sqrt(a);
			return area ;
		}
	}
		
	//METHOD PERIMETER
	public double perimeter () {
		double perimeter = sideOne + sideTwo + sideThree ; 
		return perimeter ;
	}
}

