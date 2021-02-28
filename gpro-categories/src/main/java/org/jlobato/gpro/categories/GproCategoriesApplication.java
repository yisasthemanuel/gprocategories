package org.jlobato.gpro.categories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * The Class GproCategoriesApplication.
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.jlobato.gpro")
@ImportResource("classpath:/spring-database.xml")
public class GproCategoriesApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(GproCategoriesApplication.class, args);
	}

}
