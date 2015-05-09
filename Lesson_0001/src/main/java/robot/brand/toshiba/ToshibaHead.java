package robot.brand.toshiba;

import robot.detail.IHead;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class ToshibaHead implements IHead {
    @Override
    public void mount() {
        System.out.println("Toshiba Head mounted!");
    }

    @Override
    public void unmount() {
        System.out.println("Toshiba Head unmounted!");
    }
}
