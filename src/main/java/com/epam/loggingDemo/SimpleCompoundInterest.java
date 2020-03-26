package com.epam.loggingDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util .*;

public class SimpleCompoundInterest {
	private static final Logger LOGGER=LogManager.getLogger(SimpleCompoundInterest.class);
	SimpleCompoundInterest(){
		double pr, rate, t, sim,com;
	    Scanner sc=new Scanner (System. in);
	    LOGGER.fatal("Enter the amount:");
	    pr=sc.nextDouble();
	    LOGGER.fatal("Enter the No.of years:");
	    t=sc.nextDouble();
	    LOGGER.fatal("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    sim=(pr * t * rate)/100;
	    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
	    LOGGER.fatal("Simple Interest="+sim);
	    LOGGER.fatal("Compound Interest="+com);
	    sc.close();
	}
	public static void main(String[] args) {
		SimpleCompoundInterest sci = new SimpleCompoundInterest();
	}
}
