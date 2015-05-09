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

        Robot robot1 = new Robot(new SonyHead(), new SonyHand(), new SonyLeg());
        Robot robot2 = new Robot(new ToshibaHead(), new ToshibaHand(), new ToshibaLeg());
        Robot robot3 = new Robot(new SamsungHead(), new SamsungHand(), new SamsungLeg());

        robot1.mountDetails();
        robot1.unmountDetails();

        robot2.mountDetails();
        robot2.unmountDetails();

        robot3.mountDetails();
        robot3.unmountDetails();
    }
}
