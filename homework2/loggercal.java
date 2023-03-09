package homework2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class loggercal {
    public static void logger1(StringBuilder s) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(loggercal.class.getName());
        FileHandler fh = new FileHandler("log1.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sform = new SimpleFormatter();
        fh.setFormatter(sform);
        logger.info(s.toString());
    }
}
