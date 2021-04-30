package com.te.assignment;

public abstract class Plan {
	 float rate;

	public abstract void setRate();
	
	public float generateBill(float units) {
		System.out.println(rate);
		System.out.println(units);
		return rate*units;
	}
}
