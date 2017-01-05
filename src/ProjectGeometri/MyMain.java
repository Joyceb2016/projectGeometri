package ProjectGeometri;

import java.util.Scanner;

public class MyMain {
	
//TASK 3 - ASK the user to choose a geometric figure, then choose method, and then ask for input
	public static Scanner sc = new Scanner(System.in) ;
//------------------------------------------------------------------------------------------	
	public static void main(String[] args) {
	
//TASK 4 - Loop
		boolean newFigure = true; 
		String answer;
		
		while (newFigure) {
			//Choose a geometric figure
			System.out.println("What figure do you choose; circle (c), triangle (t) or rectangle (r)? ");
			String figure = sc.nextLine() ;
			
			switch (figure.toLowerCase()) {
				case "c": circle(); 
					break ;
				case "t" : triangle() ;
					break ;
				case "r" : rectangle() ;
					break ;
				default : System.out.println("Invalid choice!") ; break;
			}
			
			//CONTINUE
			System.out.println("Do you want to make another figure? (yes or no)");
			answer = sc.nextLine();
			if(answer.equalsIgnoreCase("no")) { 
				newFigure = false ;
				System.out.println("Ok!");
			} 
			else {
				newFigure = true ;
			}
			
		}//while
	}//main -------------------------------------------------------------------------------
	
			//METHOD CIRCLE
			public static void circle() {
				//Set the circle radius
				//sc.nextLine(); Här tar man bort den text som kommer skrivas efter
				System.out.println("Set the radius (in cm): ");
				double radius = sc.nextDouble();

//TASK 2 - make new object and print the result
				//create the circle
				Circle c = new Circle ( radius ) ;
				System.out.println("A circle with the radius "+ c.getRadius() + " cm has \nthe area " + c.area() +
						" cm2 and \nthe perimeter " + c.perimeter() + " cm.\n\n*--^--*--^--*--^--*--^--*--^--*--^--*--^--*--^--*\n") ;
				sc.nextLine();
			}

			//METHOD TRIANGLE
			public static void triangle() {
				//Set the triangle sides
				System.out.println("Set the first side (in cm): ");
				double sideOne = sc.nextDouble() ;
				System.out.println("Set the second side: ");
				double sideTwo = sc.nextDouble() ;
				System.out.println("Set the third side: ");
				double sideThree = sc.nextDouble() ;

				//Create the triangle
				Triangle t = new Triangle (sideOne , sideTwo , sideThree) ;
				System.out.println("A triangle with the sides "+ t.getSideOne() + " cm, " + t.getSideTwo() + " cm and " +
						t.getSideThree() + " cm has \nthe area " + t.area() + " m2 and \nthe perimeter " + t.perimeter() + 
						" cm.\n\n*--^--*--^--*--^--*--^--*--^--*--^--*--^--*--^--*\n");
				sc.nextLine();
			}

			//METHOD RECTANGLE
			public static void rectangle() {
				//Set the rectangle sides
				System.out.println("Set the base (in cm): ");
				double base = sc.nextDouble();
				System.out.println("Set the hight: ");
				double hight = sc.nextDouble();
				
				//Create the rectangle
				Rectangle r = new Rectangle ( base , hight) ;
				System.out.println("A rectangle with the base " + r.getBase() + " cm and hight " + 
						r.getHight() + " cm has \nthe area " + r.area() + " cm2 and \nthe perimeter " + r.perimeter() +
						" cm.\n\n*--^--*--^--*--^--*--^--*--^--*--^--*--^--*--^--*\n");
				sc.nextLine();
			}
}//class



