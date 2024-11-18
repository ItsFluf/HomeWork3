package Task2;

import java.util.*;

public class Solve {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Give me a number: ");
		int num = reader.nextInt();
		int num1 = num+1;
		int num2 = num1+1;
		int num_1 = num-1;
		int num_2 = num_1-1;
		int num_3 = num_2-1;
		
		System.out.println("The 3 numbers befor your number are: " + num_1 + "," + num_2 + "," + num_3 + ",");
		System.out.println("And the 2 numbers after it are: " + num1 + "," + num2);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("The multiplication by 5 of the first number before your number is: " + num_1*5);
		System.out.println("The multiplication by 10 of the first number before your number is: " + num_1*10);
		if (num_1 < 0) {
			System.out.println(" ");
		}
		else {
			System.out.println("The square root of the first number before your number is: " + Math.sqrt(num_1));
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("The multiplication by 5 of the second number before your number is: " + num_1*5);
		System.out.println("The multiplication by 10 of the second number before your number is: " + num_2*10);
		if (num_2 < 0) {
			System.out.println(" ");
		}
		else {
			System.out.println("The square root of the second number before your number is: " + Math.sqrt(num_2));
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("The multiplication by 5 of the third number before your number is: " + num_3*5);
		System.out.println("The multiplication by 10 of the third number before your number is: " + num_3*10);
		if (num_3 < 0) {
			System.out.println(" ");
		}
		else {
			System.out.println("The square root of the third number before your number is: " + Math.sqrt(num_3));
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("The multiplication by 5 of the first number after your number is: " + num1*5);
		System.out.println("The multiplication by 10 of the first number after your number is: " + num1*10);
		if (num1 < 0) {
			System.out.println(" ");
		}
		else {
			System.out.println("The square root of the first number after your number is: " + Math.sqrt(num1));
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("The multiplication by 5 of the second number before your number is: " + num2*5);
		System.out.println("The multiplication by 10 of the second number before your number is: " + num2*10);
		if (num2 < 0) {
			System.out.println(" ");
		}
		else {
			System.out.println("The square root of the second number before your number is: " + Math.sqrt(num2));
		}
		System.out.println(" ");
		System.out.println(" ");
	}
}
