package kafka.service;

import kafka.domain.entity.OwnerInfo;
import kafka.domain.entity.SensorRecord;
import kafka.sender.SpeedSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeedService {

    @Autowired
    SpeedSender speedSender;

    public double calulateSpeed(SensorRecord sensorRecord){
        return (0.5/sensorRecord.getSecond())*3600;
    }

    public void sendSpeed(SensorRecord sensorRecord){
        double speed = calulateSpeed(sensorRecord);
        System.out.println("Speed is: "+speed+" for vehicle:"+sensorRecord.getLicencePlate());
        OwnerInfo ownerInfo = new OwnerInfo(sensorRecord.getLicencePlate(),"Shomel",speed);
        System.out.println(ownerInfo);
        speedSender.send("tofasttopic",ownerInfo);
    }
}
