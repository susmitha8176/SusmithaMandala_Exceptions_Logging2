package co.epam.hometask4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Construction {
	
	public static void costEvaluator() {
		Scanner sc= new Scanner(System.in);
		 final Logger LOGGER = LogManager.getLogger(Construction.class);
		LOGGER.info("<----------------------->");
		LOGGER.info("Construction Cost Estimation");
		LOGGER.info("Available materials");
		LOGGER.info("1. construction with standard materials");
		LOGGER.info("2. construction with above standard materials");
		LOGGER.info("3. construction with high standard materials");
		LOGGER.info("4. construction with high standard materials and fully automated");
		LOGGER.info("Enter any choice (1-4): ");
		try {
			int ch=sc.nextInt();
			LOGGER.info("Enter the area of house: ");
			switch(ch){
			case 1:
				LOGGER.info("Cost ="+sc.nextDouble()*1200 +" INR");
			   break;
			case 2:
				LOGGER.info("Cost ="+sc.nextDouble()*1500 +" INR");
				break;
			case 3:
				LOGGER.info("Cost ="+sc.nextDouble()*1800 +" INR");
			   break;
			case 4:
				LOGGER.info("Cost ="+sc.nextDouble()*2500 +" INR");
			   break;
			default:
				LOGGER.info("invalid input ... ");
				}
			}
		catch (Exception e) {
			LOGGER.info("Enter a valid input ... ");
		}
	}
}