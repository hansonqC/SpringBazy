package pl.oskarpolak.demorepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

import javax.persistence.Entity;

// Dzięki JSR310 JPA jest w stanie przekonwertować czas podany w bazie
// na nowoczesną klasę LocalTime.
@EntityScan(
		basePackageClasses = {DemorepoApplication.class, Jsr310Converters.class}
)
@SpringBootApplication
public class DemorepoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemorepoApplication.class, args);
	}
}
