package kafka.controller;

import kafka.domain.entity.SensorRecord;
import kafka.service.SensorDataSendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/camera")
public class CameraSensorRecordController {

    @Autowired
    SensorDataSendingService sensorDataSendingService;

    @Value("${spring.kafka.producer.cameraDataSendingTopic1}")
    private String cameraTopic1;

    @Value("${spring.kafka.producer.cameraDataSendingTopic2}")
    private String cameraTopic2;

    @PostMapping("/send/topic1")
    public void sendCameraDataToTopic1(@RequestBody SensorRecord sensorRecord){
        sensorDataSendingService.send(cameraTopic1,sensorRecord);
    }

    @PostMapping("/send/topic2")
    public void sendCameraDataToTopic2(@RequestBody SensorRecord sensorRecord){
        sensorDataSendingService.send(cameraTopic2,sensorRecord);
    }


}
