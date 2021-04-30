package com.te.assignment;

public class GetPlan {
	Plan plan;
	public Plan getPlan(String planType) {
		if(planType.equalsIgnoreCase("Domestic")) {
			 plan= new Domestic();
		}
		
		if(planType.equalsIgnoreCase("Commercial")) {
			plan= new Commercial();
		}
		
		if(planType.equalsIgnoreCase("International")) {
			plan= new International();
		}
		return plan;
	}

}
