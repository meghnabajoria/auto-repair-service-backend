package com.project.autorepairservice;

import com.project.autorepairservice.resolvers.ServiceModelQueryResolver;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AutoRepairServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoRepairServiceApplication.class, args);
	}

	@Bean
	public ServiceModelQueryResolver query() {
		return new ServiceModelQueryResolver();
	}

}
