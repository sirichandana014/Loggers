package com.epam.loggingDemo;

public class HouseCost {
	public static double constructionCost(String materialStd, String area, String automatedHome) {
		int matCost=0;
		switch(materialStd) {
		case "moderate":
			matCost=1500;
			break;
		
		case "high":
			switch(automatedHome) {
			case "yes":
				matCost=2500;
				break;
			case "no":
				matCost=1800;
				break;
			}
			
			break;
			 
		default:matCost=1200;
		}
		
		double constructionCost=0;
		constructionCost=Double.valueOf(area)*matCost; 
		return constructionCost;
	}
}
