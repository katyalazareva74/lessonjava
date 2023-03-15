package homework4;

//import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class loggercal {
    public static void logger1(StringBuilder s) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(loggercal.class.getName());
        //File file = new File("log2.txt");
        FileHandler fh = new FileHandler("log2.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sform = new SimpleFormatter();
        fh.setFormatter(sform);
        logger.info(s.toString());
        fh.close();
    }
}
