package log4j._01_basic;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.net.URL;

public class DemoLog {
    {
        URL url = getClass().getClassLoader().getResource("log4j.xml");
        DOMConfigurator.configure(url);
    }

    private static Logger logger = Logger.getLogger(DemoLog.class);

    public static void main(String[] args) {
        try {
            factorial(9);
            factorial(-3);
        } catch (IllegalArgumentException e) {

            // log ERROR level
            logger.error("negative argument: ", e);
        }
    }

    static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("argument " + n + " is less than zero");
        }

        // log DEBUG level
        logger.debug("argument n is: " + n);
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }

        // log INFO level
        logger.info("result is: " + result);
        return result;
    }
}
