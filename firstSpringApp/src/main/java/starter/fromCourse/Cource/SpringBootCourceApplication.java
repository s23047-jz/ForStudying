package starter.fromCourse.Cource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootCourceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCourceApplication.class, args);
	}
}
