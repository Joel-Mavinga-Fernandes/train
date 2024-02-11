package com.train.train.services;

import com.train.train.entities.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(OrderEntity entity){

        double shippimentValue = shippingService.shippiment(entity);

        double percentValue = (entity.getDesconto() * entity.getValor_basico()) / 100;

        double totalValue = entity.getValor_basico() - percentValue + shippimentValue;

        return totalValue;
    }

}
