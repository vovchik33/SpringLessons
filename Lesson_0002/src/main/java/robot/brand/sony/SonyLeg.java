package robot.brand.sony;

import robot.detail.ILeg;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class SonyLeg implements ILeg {
    @Override
    public void mount() {
        System.out.println("Sony Leg mounted!");
    }

    @Override
    public void unmount() {
        System.out.println("Sony Leg unmounted!");
    }
}
