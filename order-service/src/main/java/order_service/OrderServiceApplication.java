package order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplication {
    public static void main(String[] args) {
        System.out.println("order service is successfully running...");
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}

