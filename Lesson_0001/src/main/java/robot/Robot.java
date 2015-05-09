package robot;

import robot.detail.IHead;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
public class Robot {
    IHead head;

    public Robot() {

    }

    public Robot(IHead head) {
        this.head = head;
    }

    public void mountDetails() {
        this.head.mount();
    }

    public void unmountDetails() {
        this.head.unmount();
    }
}
