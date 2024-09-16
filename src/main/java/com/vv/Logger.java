package com.vv;

public class Logger {

    //declare the Logger class as static
    // because we want it to be used in the entire application.
    private static Logger logger = null;

    //Then we must create a private constructor
    // to avoid direct instantiations.
    private Logger() {
        super();
    }

    // We also create the getInstance() method
    // where we finally create the instance of Logger.
    // It’s important to make clear that we are using lazy loading.
    public static Logger getInstance() {
        // We first ask if the object was created. If not, we create the instance.
        if (logger == null) {
            //Another important thing to mention is
            // that we are synchronizing the creation of the object.
            // This means that we are avoiding concurrency problems.
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }

        return logger;
    }
}
