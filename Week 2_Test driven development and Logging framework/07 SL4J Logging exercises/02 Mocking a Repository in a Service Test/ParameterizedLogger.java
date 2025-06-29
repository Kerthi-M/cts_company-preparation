package maven_sl4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogger {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogger.class);

    public static void main(String[] args) {
        String user = "Kerthi";
        int age = 22;
        logger.info("User {} is {} years old", user, age);
    }
}
