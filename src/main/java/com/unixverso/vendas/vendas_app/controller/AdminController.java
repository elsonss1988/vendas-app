package com.unixverso.vendas.vendas_app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Value("${spring.datasource.url}")
    private String bancoDeDados;

    @Operation(summary = "Conexao com o banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Conexão realizada com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar conexão com o banco de dados"),
    })

    @GetMapping("/banco")
    public String connectionDB() {
        log.info(bancoDeDados);
        return "Banco de dados: " + bancoDeDados;
    }

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "vendas/cadastro";
    }

}
