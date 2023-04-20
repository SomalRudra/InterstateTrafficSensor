package kafka.receiver;


import kafka.service.FeeCalculatorService;
import kafka.domain.entity.OwnerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class SpeedReceiver {

    @Autowired
    FeeCalculatorService feeCalculatorService;

    @KafkaListener(topics = {"tofasttopic"})
    public void receive(@Payload OwnerInfo ownerInfo) {
        System.out.println("Ownner service received message= "+ ownerInfo);
        feeCalculatorService.calculateFee(ownerInfo);
    }

}