package robot.brand.samsung;

import robot.detail.IHead;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class SamsungHead implements IHead {
    @Override
    public void mount() {
        System.out.println("Samsung Head mounted!");
    }

    @Override
    public void unmount() {
        System.out.println("Samsung Head unmounted!");
    }
}
