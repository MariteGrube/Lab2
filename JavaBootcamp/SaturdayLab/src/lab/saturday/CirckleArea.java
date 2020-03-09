package lab.saturday;
import java.util.*;

//////*
//Calculates the area of a circle given its radiusSaturdayLab1: Data types. Variables. Constants. Problem 4 Write an interactive java program that accepts the radius of a circle from
//the user as input. The program computes and displays the area of the circle.
//Use a constant in the program. Save the program as CircleArea.java.
//Hint: the formula to compute the area of a circle is:
//area = PI * radius * radius *//


public class CirckleArea {

	public static void main (String [] args) {
		

		double radius;
		final double PI= 3.14;
		double area;
			

		Scanner sc;
		//create an object of Type Scanner to take input via keyboard
		
		sc= new Scanner (System.in);
		
		System.out.println("please enter radious are: ");
		radius = sc.nextDouble();
		
		//processing/
		area = PI * radius * radius;
		
		System.out.println("The are of a circle with radius: " +
			radius +  "is" + area);
		
		
		
		
	}

}
