package robot.brand.sony;

import robot.detail.IHand;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class SonyHand implements IHand {
    @Override
    public void mount() {
        System.out.println("Sony Hand mounted!");
    }

    @Override
    public void unmount() {
        System.out.println("Sony Hand unmounted");
    }
}
