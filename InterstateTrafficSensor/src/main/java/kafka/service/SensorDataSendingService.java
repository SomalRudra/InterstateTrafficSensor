package kafka.service;

import kafka.domain.entity.SensorRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SensorDataSendingService {

    @Autowired
    private KafkaTemplate<String, SensorRecord> kafkaTemplate;

    public void send(String topic,SensorRecord record){
        kafkaTemplate.send(topic,record);
    }
}
