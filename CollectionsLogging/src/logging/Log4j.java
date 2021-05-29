
package logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4j{
	static Logger logger = Logger.getLogger(Log4j.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.error("error is logged");
		logger.info("ifo is logged");
		logger.debug("error logged");

	}
} 