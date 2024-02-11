package com.train.train;

import com.train.train.entities.OrderEntity;
import com.train.train.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class TrainApplication implements CommandLineRunner {
	@Autowired
	private OrderService service;

	public static void main(String[] args) {

		SpringApplication.run(TrainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		OrderEntity order = new OrderEntity(2282,800,10);
		System.out.println("Pedido código " + order.getCodigo_pedido());
		System.out.println("Valor total: R$ " + service.total(order));

	}
}
