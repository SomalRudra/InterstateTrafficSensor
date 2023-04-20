package kafka.domain.entity;

import java.io.Serializable;

public class SensorRecord implements Serializable {
    public String licencePlate;
    public int minute;
    public int second;
    public int cameraId;

    public SensorRecord() {
    }

    public SensorRecord(String licencePlate, int minute, int second, int cameraId) {
        this.licencePlate = licencePlate;
        this.minute = minute;
        this.second = second;
        this.cameraId = cameraId;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getCameraId() {
        return cameraId;
    }

    public void setCameraId(int cameraId) {
        this.cameraId = cameraId;
    }

    @Override
    public String toString() {
        return "SensorRecord{" +
                "licencePlate='" + licencePlate + '\'' +
                ", minute=" + minute +
                ", second=" + second +
                ", cameraId=" + cameraId +
                '}';
    }
}
