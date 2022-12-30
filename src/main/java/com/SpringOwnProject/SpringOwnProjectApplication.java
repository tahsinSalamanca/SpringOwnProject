package com.SpringOwnProject;

import com.controller.GretingController;
import com.controller.InvoiceIdController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses= InvoiceIdController.class)
public class SpringOwnProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOwnProjectApplication.class, args);
	}

}
