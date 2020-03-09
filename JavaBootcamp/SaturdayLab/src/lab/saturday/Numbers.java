package lab.saturday;
////Calculates the arithmetic operations
//SaturdayLab1: Data types. Variables. Constants.Problem 3Save file as Numbers.java  -- arithmetic operations with int and double operands (i.e. variables)
// -- mixed addition
// -- integer division. double division. mixed division//

public class Numbers {

	
	public static void main(String[] args) {
	

	
	
		//declare the variable of type int//
		int iNumOne, iNumTwo, iResult;
		
		//declare variable of type double
		double dNumOne,dNumTwo,dResult;
		
		//assign/store
		
		iNumOne = 5;
		iNumTwo = 2;
		
		dNumOne = 10.0;
		dNumTwo = 11.5;
		
		
		
		String intRes = "int result :";
		String dRes = "double result:";
				
		iResult = iNumOne - (int) dNumOne;
		dResult = dNumOne - dNumTwo;
		
		System.out.println("int result:" + iResult);
		System.out.println("double result: " + dResult);	
		 
		
	
	
	}

}
