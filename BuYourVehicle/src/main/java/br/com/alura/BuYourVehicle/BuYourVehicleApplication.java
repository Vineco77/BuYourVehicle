package br.com.alura.BuYourVehicle;

import br.com.alura.BuYourVehicle.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuYourVehicleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BuYourVehicleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
