package co.epam.hometask4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	public static void main(String[] args) {
		 final Logger LOGGER = LogManager.getLogger(Main.class);
		 
		Interest.interestCalculator();

       Construction.costEvaluator();
	}

}
