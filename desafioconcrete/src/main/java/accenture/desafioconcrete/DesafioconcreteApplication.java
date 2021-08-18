package accenture.desafioconcrete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DesafioconcreteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioconcreteApplication.class, args);
	}


}
