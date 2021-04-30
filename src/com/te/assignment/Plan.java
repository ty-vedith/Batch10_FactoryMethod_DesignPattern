package com.te.assignment;

public abstract class Plan {
	 float rate;

	public abstract void setRate();
	
	public float generateBill(float units) {

		return rate*units;
	}
}
