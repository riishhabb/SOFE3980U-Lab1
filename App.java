package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		//Function for showing the current local time
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);

		//Initialized first binary number
		Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());

		//Initialized second binary number
		Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());

		//Adding 2 binary numbers
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());

		//Logical Or operation on 2 binary numbers
		Binary or= Binary.or(binary1,binary2);
		System.out.println( "Their bitwise logic or is "+or.getValue());

		//Multiplication of 2 binary numbers
		Binary multiply= Binary.multiply(binary1,binary2);
		System.out.println( "Their multiplication is "+multiply.getValue());

		//Logical AND of 2 binary numbers
		Binary and= Binary.and(binary1,binary2);
		System.out.println( "Their bitwise logic and is "+and.getValue());
    }
}
