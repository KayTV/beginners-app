package com.kaytv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int studentAge = 15;
	    double studentGPA = 3.45;
	    String studentFirstName = "Kaylyn";
	    String studentLastName = "VanHops";
	    boolean hasPerfectAttendence = true;

	    System.out.println(studentFirstName + " " + studentLastName +
				" has a GPA of " + studentGPA);
	    System.out.println("What do you want to change it to?");

		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();

		System.out.println(studentFirstName + " " + studentLastName +
				" now has a GPA of " + studentGPA);
    }
}
