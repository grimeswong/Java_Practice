/**
 * @(#)GpaCalculator.java
 *
 *	This program is for the calculation of the accumulated GPA grades (Pre-2013)
 *
 *
 * @author Grimes Wong
 * @version 1.00 2015/5/10
 */

//import java.util.*;

import java.io.*;

public class GpaCalculator {

	public static void main (String args[])	{
		final float HD = 7.0f;	//f = float declaration
		final float D = 6.0f;
		final float C = 5.0f;
		final float P = 4.0f;
		final float PC = 3.0f;
		final float F = 1.5f;
		final float FNS = 0;
		final float WF = 0;
		final float NGP = 0;
    	float gpa = 0.0f;
    	boolean quit = false;
    	String input = "";
    	int totalSubject = 0;

    	while(quit != true){
    		System.out.println ("Please enter the grade of your subjects :\nHD = High Distinction \nD = Distinction \nC = Credit \nPC = Pass Concide \nP = Pass \nF = Fail \nFNS = Fail no submission of assessment \nWF = Withdrawn with failure \nNGP = Non-graded Pass");
    		InputStreamReader isr = new InputStreamReader(System.in);
    		BufferedReader buffer = new BufferedReader(isr);
    		
    		try {
    		   	input = buffer.readLine();
    			buffer.close();
    		}
    		catch (IOException e){
    			System.out.println("An input error has occurred"); //Wrong format message
    		}
    		// Case Selections
			if (input == "HD" || input == "hd") {
				System.out.println("Your grade is " + input);
    		//	quit = true; //break
    			
			} else if (input == "D") {
				System.out.println("Your grade is " + input);
			//	quit = true; //break
			}
    	} 
    	   		
    		
		
		System.out.println("Current studied subjects are ");
		System.out.println("Current GPA is " + gpa);
		
		


	}
	
	public double calculate(int totalSub, double avgGpa){
		double currentGpa = (totalSub+1)/avgGpa;
		return currentGpa;
	}





}