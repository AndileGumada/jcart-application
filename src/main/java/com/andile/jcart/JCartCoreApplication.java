package com.andile.jcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JCartCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(JCartCoreApplication.class, args);
//		// Create the Flyway instance and point it to the database
//		Flyway flyway = Flyway.configure().dataSource("jdbc:postgresql://localhost:5432/jcart", "root", "root").load();
//
//		// Start the migration
//		flyway.migrate();

	}
}
