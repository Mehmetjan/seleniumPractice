package log4j.com;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jPractice2 {

	
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
	
		Logger logger  = LogManager.getLogger(Log4jPractice2.class);
		logger.debug("this is debug");
		logger.info("this is info");
		logger.fatal("this is fatal message");
		logger.error("this si error message");
		
	}

}
