import robot.Robot;
import robot.brand.sony.SonyHead;
import robot.brand.toshiba.ToshibaHead;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!!!");
        Robot robot1 = new Robot(new SonyHead());
        Robot robot2 = new Robot(new ToshibaHead());
        robot1.mountDetails();
        robot1.unmountDetails();
        robot2.mountDetails();
        robot2.unmountDetails();
    }
}
