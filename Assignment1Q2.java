/**
 * 
 * @author Lievin Niyoyandika
 *
 */

// importing the dictionary required in this program

import java.util.Scanner;

public class Assignment1Q2 {

	public static void main(String[] args) {
		
		//creating class scanner to read data from system in
		Scanner scannerObject = new Scanner(System.in);
		//ask the use to enter the length of the rectangle and width on line 20
		System.out.println("enter length of rectangle: ");
		int length = scannerObject.nextInt();
		System.out.println("enter width of rectangle: ");
		int width = scannerObject.nextInt();
		scannerObject.close(); 
		
		// the formula for calculating the parameter and surface area of rectangle
		int parameterRectangle = (length + width)*2;
		int areaRectangle = length * width;
		
		System.out.println("\t\t the parameter of rectangle in different data types");
		// converting parameter from integer into short
		short myShort = (short) parameterRectangle;		
		System.out.println("\nthe parameter of rectangle using short data type is: " + myShort);
		
		//printing the parameter of rectangle, note: no need of converting because it is also in integer
		System.out.println("the parameter of rectangle using integer data type is : " + parameterRectangle);
		
		//converting form integer into double
		double myDouble = parameterRectangle;
		System.out.printf("the parameter of rectangle using double data type is %.4f %n", + myDouble);
		
		//converting from integer into double data type
		long myLong =  parameterRectangle;
		System.out.println("the parameter of rectangle using long data type is : " + myLong);

		// this the line is here as title
		System.out.println("\n\t\t surface area of rectangle in different data type :");
		
		//convert form integer into short data type
		short myShortArea = (short) areaRectangle;
		System.out.println("\nthe surface of the rectangle using short data type is: " + myShortArea);
		
		//nothing changed it was in integer data type no need to change
		System.out.println("the surface of the rectangle by using integer data type is : " + areaRectangle);
		
		//converting integer into double data type
		double myDoubleArea = areaRectangle;
		System.out.printf("the surface of the rectangle by using double data type is %.4f %n", + myDoubleArea);
	
		//converting form intiger into long data type
		long myLongArea =  areaRectangle;
		System.out.println("the surface of the rectangle by using long data type is : " + myLongArea);
		
		
	}
	
}
		
		
		
	