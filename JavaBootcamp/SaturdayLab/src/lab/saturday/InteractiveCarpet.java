package lab.saturday;
import java.util.*;



public class InteractiveCarpet {
	public static void main(String[]args) {
	
	double length,price,width;
	Scanner sc = new Scanner (System.in);
	
	System.out.println("PLease enter the lenght");
	length = sc.nextDouble();
	System.out.println("please enter the width");
	width = sc.nextDouble();
	
	System.out.println("Please tnere the price");
	price = sc.nextDouble();
	double area, cost;
	area = width * length;
	cost = area * price;

	String resultText = "The total cost of our carpet";
	String costText = "will cost you around";
	
	System.out.println(resultText + "width:" + width + "and with length" + length + costText + cost + "EUR");
	
	}

}
