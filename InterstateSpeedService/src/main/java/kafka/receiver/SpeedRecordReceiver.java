package kafka.receiver;


import kafka.service.SpeedService;
import kafka.domain.entity.SensorRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class SpeedRecordReceiver {

    @Autowired
    SpeedService speedService;

    @KafkaListener(topics = {"cameraTopic1", "cameraTopic2"})
    public void receive(@Payload SensorRecord record) {
        System.out.println("Speed received message= "+ record.toString());
        speedService.sendSpeed(record);
    }

}