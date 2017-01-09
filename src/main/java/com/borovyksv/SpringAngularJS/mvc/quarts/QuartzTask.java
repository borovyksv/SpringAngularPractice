package com.borovyksv.SpringAngularJS.mvc.quarts;

/**
 * Created by user-pc on 09.01.2017.
 */

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

        import java.util.Calendar;
/**
 * look application-context.xml
 * 1. simpleTrigger
 * 2. simpleQuartzJob
 * 3. bean id="simpleQuartzTask"
 * 4. Quartz Scheduler
 */
public class QuartzTask {

    private static final Logger logger = LoggerFactory.getLogger(QuartzTask.class);

    public void simpleTaskMethod() {
//		you can log here to database with simpletrigger
        logger.info("Test Simple Quartz Time: " + Calendar.getInstance().getTime());
        System.out.println("Test Simple Quartz Time: " + Calendar.getInstance().getTime());
    }

}
