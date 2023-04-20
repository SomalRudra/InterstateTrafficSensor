package kafka.service;

import kafka.domain.entity.OwnerInfo;
import org.springframework.stereotype.Service;

@Service
public class FeeCalculatorService {

    public void calculateFee(OwnerInfo ownerInfo){
        double fee = 0;
        System.out.println(ownerInfo.getSpeed());
        if(ownerInfo.getSpeed()>=72 && ownerInfo.getSpeed()<=77){
            fee = 25;
        }else if(ownerInfo.getSpeed()>=77 && ownerInfo.getSpeed()<=82){
            fee = 45;
        }else if(ownerInfo.getSpeed()>=80){
            fee = 125;
        }
       System.out.println(fee);
    }
}
