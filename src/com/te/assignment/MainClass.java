package com.te.assignment;

import java.util.Scanner;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	static String planType;
	static int units;

	public static void main(String[] args) {
		GetPlan gp = new GetPlan();
		System.out.println("Enter the Type ");
		planType = sc.nextLine();
		System.out.println("Enter the Units ");
		units = sc.nextInt();

		Plan p = gp.getPlan(planType);
		p.setRate();
		p.generateBill(units);

	}

}
