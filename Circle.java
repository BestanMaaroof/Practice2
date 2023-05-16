/**
 * Program Name: Circle.java <br>
 * Purpose: a class to model a circle in computer code.
 * Coder: Bestan Maaroof Section PT01
 * Date: May 5, 2023
 */

public class Circle {
	//DATA MEMBERS
	//note:we are including constructor methods here,so we will initialize the 
	//      data members INSIDE THE CONSTRUCTOR METHOD
	
	public double radius;
	public String color;
	
	//Constructor
	//note: we are going to use the same names for the formal parameter in the method parameter
	//list as the names of the data members. THIS IS CALLED NAME SHADOWING, and you have to 
	// use JAVA keyword 'this'
	Circle(double radius, String color){
		this.radius=radius;
		this.color=color;
	}
	
	
	//Methods
    /**
    Method Name: calcArea()
    Purpose: a public instance method that calculates the area of a Circle object
    Accepts:NOTHIG! Uses the Circle object's own radius value.
    Return:a double that is the area of the circle object
    Date: May 5,2023
     */
	public double calcArea() {
		
		return Math.PI* this.radius*this.radius;
		
		
	}//end of method
		
	/**
    Method Name: calcCircumference()
    Purpose: a public instance method that calculates the circumference of a Circle object
    Accepts:NOTHIG! Uses the Circle object's own radius value.
    Return:a double that is the circumference of the circle object
    Date: May 5,2023
     */
	public double calcCircumference() {
		
		return 2*Math.PI* this.radius;
		
		
	}//end of method
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//end class