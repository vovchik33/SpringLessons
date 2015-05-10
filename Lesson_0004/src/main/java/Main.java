import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robot.Robot;

/**
 * Created by unclejoe33 on 10.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Robot robotSony = (Robot) context.getBean("robotSony");
        robotSony.mountDetails();
        robotSony.unmountDetails();
    }
}
