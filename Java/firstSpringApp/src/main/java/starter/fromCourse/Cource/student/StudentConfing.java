package starter.fromCourse.Cource.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfing {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Filip = new Student("Filip", LocalDate.of(2000, Month.JANUARY, 5), "filip@onet.eu");
            Student Alex = new Student("Alex", LocalDate.of(2000, Month.MARCH, 15), "alex@onet.eu");
            repository.saveAll(List.of(Filip, Alex));
        };
    }
}
