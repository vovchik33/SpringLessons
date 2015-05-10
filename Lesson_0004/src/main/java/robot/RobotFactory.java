package robot;

import org.springframework.beans.factory.FactoryBean;
import robot.detail.IHand;
import robot.detail.IHead;
import robot.detail.ILeg;

/**
 * Created by unclejoe33 on 10.05.2015.
 */
public class RobotFactory implements FactoryBean<RobotFactory> {

    public Robot getRobot() throws Exception {
        return new Robot();
    }

    public Robot getRobot(IHead head, IHand hand, ILeg leg) throws Exception {
        Robot robot=new Robot(head, hand, leg);
        robot.mountDetails();
        return robot;
    }

    public RobotFactory getObject() throws Exception {
        return this;
    }

    public Class<?> getObjectType() {
        return RobotFactory.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
