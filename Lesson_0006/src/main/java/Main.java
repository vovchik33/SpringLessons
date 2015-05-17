import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robot.Robot;

/**
 * Created by unclejoe33 on 18.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!!!");
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        Robot robot = (Robot) context.getBean("robotBean");
        System.out.println(robot.toString());
    }
}
