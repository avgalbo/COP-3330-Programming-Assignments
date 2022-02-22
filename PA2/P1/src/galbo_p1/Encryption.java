package galbo_p1;
import java.util.Scanner;

public class Encryption {
	
	public static String encrypt(String num)
	{
		int arr[] = new int[4];
		int i, temp, newNum = 0;
		String output;
		
		for(i = 0; i < 4; i++)
		{
			char ch = num.charAt(i);
			arr[i] = Character.getNumericValue(ch);
		}
		
		for(i = 0; i < 4; i++)
		{
			temp = arr[i];
			temp += 7;
			temp = temp % 10;
			arr[i] = temp;
		}
		
			temp = arr[0];
			arr[0] = arr[2];
			arr[2] = temp;
			temp = arr[1];
		    arr[1] =arr[3];
		    arr[3] = temp;
		    
		    for(i = 0; i < 4; i++)
		    	newNum = newNum * 10 + arr[i];
		    
		    output = Integer.toString(newNum);
		    
		    if(arr[0] == 0)
		    	output = "0" + output;
		    
		    return output;
	}
	
	public static String decrypt(String num)
	{
		int arr[] = new int[4];
		int i, temp, digit, newNum = 0;
		String output;
		
		for(i = 0; i < 4; i++)
		{
			char ch = num.charAt(i);
			arr[i] = Character.getNumericValue(ch);
		}
		
			temp = arr[0];
			arr[0] = arr[2];
			arr[2] = temp;
			temp = arr[1];
		    arr[1] =arr[3];
		    arr[3] = temp;
		    
		    for(i=0;i<4;i++) 
		    {
		           digit = arr[i];
		          
		          if(digit == 0)
		        	  arr[i] = 3;
		          else if(digit == 1)
		        	  arr[i] = 4;
		          else if(digit == 2)
		        	  arr[i] = 5;
		          else if(digit == 3)
		        	  arr[i] = 6;
		          else if(digit == 4)
		        	  arr[i] = 7;
		          else if(digit == 5)
		        	  arr[i] = 8;
		          else if(digit == 6)
		        	  arr[i] = 9;
		          else if(digit == 7)
		        	  arr[i] = 0;
		          else if(digit == 8)
		        	  arr[i] = 1;
		          else if(digit == 9)
		        	  arr[i] = 2;
		       
		    }
		    
		    for(i = 0; i < 4; i++)
		    	newNum = newNum * 10 + arr[i];
		    
		    output = Integer.toString(newNum);
		    
		    if(arr[0] == 0)
		    	output = "0" + output;
		    
		    return output;
	
	}
	
	
	public static void main(String[] args) {
	
	Scanner scnr = new Scanner(System.in);
	System.out.print("Enter 4 digit number: ");
	String num = scnr.nextLine();
	System.out.println("The encrypted number is: " + encrypt(num));
	System.out.println("The origonal number is: " + decrypt(encrypt(num)));
	}
}
