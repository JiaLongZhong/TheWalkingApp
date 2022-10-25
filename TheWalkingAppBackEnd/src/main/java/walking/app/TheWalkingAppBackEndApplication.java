package walking.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("walking.app")
public class TheWalkingAppBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheWalkingAppBackEndApplication.class, args);
	}

}
