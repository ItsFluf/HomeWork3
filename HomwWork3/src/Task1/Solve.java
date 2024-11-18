package Task1;

import java.math.*;
import java.util.*;

public class Solve {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Give me the length of a chest:");
		float length = reader.nextFloat();
		System.out.print("Give me the width of a chest:");
		float width = reader.nextFloat();
		System.out.print("Give me the height of a chest:");
		float height = reader.nextFloat();
		float largest = 0;
		float second_largest = 0;
		if ((length == width) && (length == height) && (width == height)) {
			int aluminum_foil_cover_cost = (int)(3*(6*Math.pow(length , 2)));
			System.out.println("This is a cube.\nTo cover the hole cube with aluminum foil that costs 3₪ per cubic meter will cost " + aluminum_foil_cover_cost + "₪");
		}
		else {
			
			if (length >= width && length >= height) {
				largest = length;
				second_largest = (width > height) ? width : height;
			}
			else {
				if (width >= length && width >= height) {
					largest = width;
				    second_largest = (length > height) ? length : height;
				}
				else {
					largest = height;
				    second_largest = (length > width) ? length : width;
				}
			}

			
			System.out.println("The area of biggest face of the chest is " + Math.ceil(largest * second_largest));
		}
	}
}
