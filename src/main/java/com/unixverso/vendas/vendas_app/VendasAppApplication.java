package com.unixverso.vendas.vendas_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Vendas API", version = "1.0", description = "API para controle de vendas"))

public class VendasAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendasAppApplication.class, args);
	}

}
