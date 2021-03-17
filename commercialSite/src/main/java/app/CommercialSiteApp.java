package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CommercialSiteApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CommercialSiteApp.class, args);
			
	}

}