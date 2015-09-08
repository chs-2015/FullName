/**
 * Author: Brandon B.
 * Date: 9-4-15
 */

import java.util.Scanner;
public class FullName {
    
    public static void main(String[] args) {
    	String firstName, lastName, fullName;
    	Scanner kbReader = new Scanner(System.in);

		System.out.print("What is your first name? ");
		firstName = kbReader.next();

		System.out.print("What is your last name? ");
		lastName = kbReader.next();

		fullName = firstName + " " + lastName;
		System.out.println("In case you didn't know, your full name is " + fullName + ".");
    }
}
