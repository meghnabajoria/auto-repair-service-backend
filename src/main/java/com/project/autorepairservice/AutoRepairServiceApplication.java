package com.project.autorepairservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AutoRepairServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoRepairServiceApplication.class, args);
		System.out.println("hiiii");
	}

}
