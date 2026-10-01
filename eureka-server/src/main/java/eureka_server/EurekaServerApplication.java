package eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer          // ← this single annotation turns it into a Eureka Server
public class EurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		System.out.println("\n✅ Eureka Server started!");
		System.out.println("📊 Dashboard: http://localhost:8761\n");
	}
}
