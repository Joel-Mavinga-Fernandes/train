package com.train.train.services;

import com.train.train.entities.OrderEntity;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shippiment(OrderEntity entity){

        if(entity.getValor_basico() >= 200){
            return 0;
        } else if (entity.getValor_basico() >= 100 && entity.getValor_basico() < 200) {
            return 12;
        }else {
            return 20;
        }

    }
}
