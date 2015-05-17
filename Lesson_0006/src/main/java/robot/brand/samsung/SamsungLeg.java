package robot.brand.samsung;

import org.springframework.stereotype.Component;
import robot.detail.ILeg;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class SamsungLeg implements ILeg {
    @Override
    public void mount() {
        System.out.println("Samsung Leg mounted!");
    }

    @Override
    public void unmount() {
        System.out.println("Samsung Leg unmounted!");
    }
}
