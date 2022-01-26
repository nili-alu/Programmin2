

// import the required dictionaries, one for decimal numbers and other for scanner
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author Lievin
 *
 */
//Note that this program is designed to ask the user some information, and help him/her to know your BMI

public class Assignment1 {
	public static void main(String[] args) {
		
		
		Scanner assignment = new Scanner(System.in);
		
		//asking the user to enter name
		System.out.println("Enter your name: ");
		String name = assignment.nextLine();
		
		// this is for the user to enter his/her weight
		System.out.println("Enter your weight, please in Kg: ");
		float weight =  assignment.nextFloat();
		
		// for the user to enter his/her height
		System.out.println("Enter your height, please in meter: ");
		float height =  assignment.nextFloat();
		assignment.close();           // this is for closing the scanner
		
		// formula for calculating BMI
		float BMI = (weight/(height*height));
		
		// this is for converting the BMI into two decimal numbers only.
		DecimalFormat df = new DecimalFormat("#.##");
		String formattedBMI = df.format(BMI);
		
		// this the final answer 
		System.out.println("my name is " + name +" ,my BMI is : "+ formattedBMI+"kg/m2");

		

	}

}

