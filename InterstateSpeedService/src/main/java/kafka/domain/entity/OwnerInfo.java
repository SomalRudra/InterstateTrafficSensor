package kafka.domain.entity;

import java.io.Serializable;

public class OwnerInfo implements Serializable {
    public String licensePlate;
    public String ownerName;

    public double speed;

    public OwnerInfo() {
    }

    public OwnerInfo(String licensePlate, String ownerName, double speed) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "OwnerInfo{" +
                "licensePlate='" + licensePlate + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", speed=" + speed +
                '}';
    }
}
