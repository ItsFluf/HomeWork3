package Task4;

import java.util.*;

public class Solve {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Give me the temperature in fahrenheit(°F): ");
		float F_degrees = reader.nextFloat();
		float C_degrees = ((F_degrees - 32)*5) / 9;
		System.out.println("The temperature in °C to " + F_degrees + "°F is: " + C_degrees + "°C");
	}
}
