package robot;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by unclejoe33 on 10.05.2015.
 */
public class RobotFactory implements FactoryBean<Robot> {
    public Robot getRobotInstance() throws Exception {
        return new Robot();
    }

    @Override
    public Robot getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return Robot.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
