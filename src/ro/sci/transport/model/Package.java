package ro.sci.transport.model;

import java.util.Date;

/**
 * Created by Skipy on 5/20/2017.
 */
public class Package implements Comparable<Package> {
    private String targetLocation;
    private int distanceToTarget;
    private float value;
    private Date deliveryDate;

    public Package(String targetLocation, int distanceToTarget, float value, Date deliveryDate) {
        this.targetLocation = targetLocation;
        this.distanceToTarget = distanceToTarget;
        this.value = value;
        this.deliveryDate = deliveryDate;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
    }

    public int getDistanceToTarget() {
        return distanceToTarget;
    }

    public void setDistanceToTarget(int distanceToTarget) {
        this.distanceToTarget = distanceToTarget;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public int compareTo(Package o1) {
        if (o1.getTargetLocation().equals(targetLocation)) {
            return o1.getDeliveryDate().compareTo(deliveryDate);
        } else {
            return o1.getTargetLocation().compareTo(targetLocation);
        }
    }

    @Override
    public String toString() {
        return "Package{" +
                "targetLocation='" + targetLocation + '\'' +
                ", distanceToTarget=" + distanceToTarget +
                ", value=" + value +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}
