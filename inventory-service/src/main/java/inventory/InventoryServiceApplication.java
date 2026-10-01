package inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		System.out.println("Inventory service started...");
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

}
