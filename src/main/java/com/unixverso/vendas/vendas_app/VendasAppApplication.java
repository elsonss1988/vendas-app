package com.unixverso.vendas.vendas_app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Vendas API", version = "1.0", description = "API para controle de vendas"))

public class VendasAppApplication {

	private static Logger logger = LoggerFactory.getLogger(VendasAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(VendasAppApplication.class, args);
		logger.info("Aplicação iniciada com sucesso!");
	}

}
