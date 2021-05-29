package log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jPractice {

	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(Log4jPractice.class);
		logger. debug("this is debug i created");
		logger.info("this is debug i created");
		logger.warn("this is debug i created");
		logger.error("this is debug i created");
		logger.fatal("this is debug i created");
	}

}
