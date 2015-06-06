package robot.brand.sony;

import robot.detail.IHead;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class SonyHead implements IHead {
    @Override
    public void mount() {
        System.out.println("Sony Head mounted!");
    }

    @Override
    public void unmount() {
        System.out.println("Sony Head unmounted!");
    }
}
