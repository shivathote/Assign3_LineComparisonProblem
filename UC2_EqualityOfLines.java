package com.Assign3.LineComparison.BridgeLabz;

import java.util.Scanner;

public class UC2_EqualityOfLines {
	public static void main(String[] args) {
	Scanner line = new Scanner(System.in);
	System.out.println("Enter the value of X coordinate at first point:");
	int x1 = line.nextInt();
	System.out.println("Enter the value of Y coordinate at first point:");
	int y1 = line.nextInt();
	System.out.println("Enter the value of X coordinate at second point:");
	int x2 = line.nextInt();
	System.out.println("Enter the value of Y coordinate at second point:");
	int y2 = line.nextInt();
	System.out.println("Enter the value of X coordinate at third point:");
	int x3 = line.nextInt();
	System.out.println("Enter the value of Y coordinate at third point:");
	int y3 = line.nextInt();
	System.out.println("Enter the value of X coordinate at fourth point:");
	int x4 = line.nextInt();
	System.out.println("Enter the value of Y coordinate at fourth point:");
	int y4 = line.nextInt();
	
	double Length_of_line1 = Math.sqrt((x2-x1)^2+(y2-y1)^2);
	double Length_of_line2 = Math.sqrt((x4-x3)^2+(y4-y3)^2);
	System.out.println("The Length Of Line Is"+ Length_of_line2);
	
	int condition = Length_of_line1.compareTo(Length_of_line2);
	if (condition == 0)
		System.out.println("Two Lines Are Equal");
	else
		System.out.println("Two Lines Are Not Equal");
	
	}
}
