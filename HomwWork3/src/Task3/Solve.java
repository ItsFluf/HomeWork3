package Task3;

import java.util.*;

public class Solve {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Give me the radius of a circle: ");
		double radius = reader.nextFloat();
		double diameter = 2 * radius;
		double area = Math.PI * Math.pow(radius, 2);
		double circumference = Math.PI * radius;
		System.out.println("For a circle with a radius of " + radius + " units:");
		System.out.println("The diameter of the circle is: " + diameter + " units:");
		System.out.println("The area of the circle is: " + area + " units:");
		System.out.println("The circumference of the circle is: " + circumference + " units:");
	}
}
