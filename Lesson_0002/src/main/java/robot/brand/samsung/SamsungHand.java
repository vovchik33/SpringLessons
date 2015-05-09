package robot.brand.samsung;

import robot.detail.IHand;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class SamsungHand implements IHand {
    @Override
    public void mount() {
        System.out.println("Samsung Hand mounted!");
    }

    @Override
    public void unmount() {
        System.out.println("Samsung Hand unmounted");
    }
}
