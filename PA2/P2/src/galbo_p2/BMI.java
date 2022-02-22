package galbo_p2;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
			
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter weight (in pounds): ");
        double weight = scnr.nextDouble();
        System.out.print("Enter height (in inches): ");
        double height = scnr.nextDouble();
        
        double bmi = (weight * 703) / (height * height);
        
        System.out.printf("BMI: %.2f ----> You are ", bmi);
       
        if(bmi < 18.5)
        	System.out.println("Underweight");
        else if(bmi < 25)
        	System.out.println("Normal weight");
        else if(bmi < 30)
        	System.out.println("Overweight");
        else
        	System.out.println("Obese");
        	

	}

}
