package maven_sl4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLogger {
    private static final Logger logger = LoggerFactory.getLogger(AppenderLogger.class);

    public static void main(String[] args) {
        logger.info("Logging to both console and file using logback.xml");
    }
}
