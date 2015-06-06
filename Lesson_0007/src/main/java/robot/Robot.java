package robot;

import robot.detail.IHand;
import robot.detail.IHead;
import robot.detail.ILeg;

/**
 * Created by unclejoe33 on 09.05.2015.
 */

public class Robot {
    IHead head;
    IHand hand;
    ILeg leg;

    public Robot() {

    }

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public void mountDetails() {
        this.hand.mount();
        this.head.mount();
        this.leg.mount();
    }

    public void unmountDetails() {
        this.hand.unmount();
        this.head.unmount();
        this.leg.unmount();
    }
}
