package co.epam.hometask4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interest {
	public static void interestCalculator(){
		Scanner sc=new Scanner(System.in);
		final Logger LOGGER = LogManager.getLogger(Interest.class);
		LOGGER.info("Enter principle");
		try {
			double principal = sc.nextDouble();
			LOGGER.info("Enter the time ");
			double time = sc.nextDouble();
			LOGGER.info("Enter the rate of interest");
			double rateOfInterest=sc.nextDouble();
			LOGGER.info("Simple Interest :"+(principal*time*rateOfInterest)/100);
			LOGGER.info("Compound Interest :"+((principal*Math.pow(1+(rateOfInterest/100),time)-principal)));
			LOGGER.info("<--------------------------------------------->");
			}
		catch (Exception e) {
			LOGGER.info("Enter a valid input ... ");
		}
	}
}
