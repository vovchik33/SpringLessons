import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robot.Robot;
import robot.brand.samsung.SamsungHand;
import robot.brand.samsung.SamsungHead;
import robot.brand.samsung.SamsungLeg;
import robot.brand.sony.SonyHand;
import robot.brand.sony.SonyHead;
import robot.brand.sony.SonyLeg;
import robot.brand.toshiba.ToshibaHand;
import robot.brand.toshiba.ToshibaHead;
import robot.brand.toshiba.ToshibaLeg;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!!!");

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Robot robotToshiba = (Robot) context.getBean("robotToshiba");
        Robot robotSony = (Robot) context.getBean("robotSony");
        Robot robotSamsung = (Robot) context.getBean("robotSamsung");

        robotSony.mountDetails();
        robotToshiba.mountDetails();
        robotSamsung.mountDetails();

        robotSony.unmountDetails();
        robotToshiba.unmountDetails();
        robotSamsung.unmountDetails();
    }
}
