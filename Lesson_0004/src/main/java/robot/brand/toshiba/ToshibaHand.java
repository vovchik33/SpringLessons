package robot.brand.toshiba;

import robot.detail.IHand;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class ToshibaHand implements IHand {
    @Override
    public void mount() {
        System.out.println("Toshiba Hand mounted!");
    }

    @Override
    public void unmount() {
        System.out.println("Toshiba Hand unmounted");
    }
}
