package logger.com;

import org.apache.log4j.Logger;

public class Log4jLogger {

	public static void main(String[] args) {
				
			final Logger logger = Logger.getLogger(Log4jLogger.class);
			logger. debug("this is debug i created");
			logger.info("this is debug i created");
			logger.warn("this is debug i created");
			logger.error("this is debug i created");
			logger.fatal("this is debug i created");

	}

}
