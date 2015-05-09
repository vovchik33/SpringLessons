package robot.brand.toshiba;

import robot.detail.ILeg;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class ToshibaLeg implements ILeg {
    @Override
    public void mount() {
        System.out.println("Toshiba Leg mounted!");
    }

    @Override
    public void unmount() {
        System.out.println("Toshiba Leg unmounted!");
    }
}
