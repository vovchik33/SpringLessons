package robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import robot.detail.IHand;
import robot.detail.IHead;
import robot.detail.ILeg;

/**
 * Created by unclejoe33 on 09.05.2015.
 */
@Component
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

    @Autowired
    @Qualifier("samsungHead")
    public void setHead(IHead head) {
        this.head = head;
    }
    public IHead getHead() {
        return head;
    }


    @Autowired
    @Qualifier("sonyHand")
    public void setHand(IHand hand) {
        this.hand = hand;
    }
    public IHand getHand() {
        return hand;
    }

    @Autowired
    @Qualifier("toshibaLeg")
    public void setLeg(ILeg leg) {
        this.leg = leg;
    }
    public ILeg getLeg() {
        return leg;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Robot{");
        sb.append("head=").append(head);
        sb.append(", hand=").append(hand);
        sb.append(", leg=").append(leg);
        sb.append('}');
        return sb.toString();
    }
}
