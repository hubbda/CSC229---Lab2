package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
		
		// ToDo 7: Add a toString method for Student class
		
		Student std1= new Student("James", (short) 20);
		
		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter student gpa: ");
		//read user input and set gpa
		std1.setGpa(sc.nextDouble());

		//sets address
		std1.setAddress("123 Dr");

		//print out student info
		System.out.println(std1.toString());
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}