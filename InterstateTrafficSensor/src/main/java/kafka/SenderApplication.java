package kafka;

import kafka.domain.entity.SensorRecord;
import kafka.service.SensorDataSendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SenderApplication implements CommandLineRunner {
    @Autowired
    SensorDataSendingService sensorDataSendingService;



//    @Autowired
//    SensorRecordFactory sensorRecordFactory;


    public static void main(String[] args) {
        SpringApplication.run(SenderApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        SensorRecord camera1 = new SensorRecord("MMX899",12,10,9874);
        SensorRecord camera2 = new SensorRecord("BMX899",10,5,9909);

        sensorDataSendingService.send("cameraTopic1", camera1);
        sensorDataSendingService.send("cameraTopic2", camera2 );
        System.out.println("Message has been sent");
    }
}
