package javaTips_Enums;

import java.util.Arrays;

//ordinal	   0		1		2		3
enum Season {WINTER, SUMMER, FALL, SPRING}
	
public class Main {

	public static void main(String[] args) {
		Season s1 = Season.valueOf("WINTER");
		System.out.println(s1.ordinal()); // 0
		System.out.println(s1.name()); // WINTER
		System.out.println(s1); // WINTER
		
		Season s2 = Season.FALL;
		System.out.println(s2.ordinal()); // 2
		System.out.println(s2.name()); // FALL
		System.out.println(s2); // FALL
		
		// The Season.values() returns an array with the values of the enum
		Season[] enumValues = Season.values();
		System.out.println(Arrays.toString(enumValues)); // [WINTER, SUMMER, FALL, SPRING]
		
		Color c1 = Color.RED;
		System.out.println(c1.ordinal()); // 0
		System.out.println(c1.name()); // RED
		System.out.println(c1); // RED
		System.out.println(c1.getValue()); // 10
		
		Color c2 = Color.valueOf("GREEN");
		System.out.println(c2.ordinal()); // 2
		System.out.println(c2.name()); // GREEN
		System.out.println(c2); // GREEN
		System.out.println(c2.getValue()); // 30
	}

}
