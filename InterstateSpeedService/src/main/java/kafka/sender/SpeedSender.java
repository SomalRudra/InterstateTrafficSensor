package kafka.sender;

import kafka.domain.entity.OwnerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SpeedSender {
    @Autowired
    private KafkaTemplate<String, OwnerInfo> kafkaTemplate;

    public void send(String topic, OwnerInfo ownerInfo){
        kafkaTemplate.send(topic, ownerInfo);
    }
}
