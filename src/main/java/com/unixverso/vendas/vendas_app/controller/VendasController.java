package com.unixverso.vendas.vendas_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/vendas")
@Tag(name = "Vendas", description = "API para controle de vendas")
public class VendasController {

    @Operation(summary = "Cadastrar uma nova venda")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "vendas/cadastro";
    }

    @Operation(summary = "Listar todas as vendas")
    @RequestMapping("/listar")
    public String listar() {
        return "vendas/lista";
    }

    @Operation(summary = "Editar uma venda")
    @RequestMapping("/editar")
    public String editar() {
        return "vendas/editar";
    }

    @Operation(summary = "Excluir uma venda")
    @RequestMapping("/excluir")
    public String excluir() {
        return "vendas/excluir";
    }

    @Operation(summary = "Buscar uma venda")
    @RequestMapping("/salvar")
    public String salvar() {
        return "vendas/salvar";
    }

    @Operation(summary = "Filtrar vendas")
    @RequestMapping("/atualizar")
    public String atualizar() {
        return "vendas/atualizar";
    }

    @Operation(summary = "Remover uma venda")
    @RequestMapping("/remover")
    public String remover() {
        return "vendas/remover";
    }

    @Operation(summary = "Buscar uma venda")
    @RequestMapping("/buscar")
    public String buscar() {
        return "vendas/buscar";
    }

    @Operation(summary = "Filtrar vendas")
    @RequestMapping("/filtrar")
    public String filtrar() {
        return "vendas/filtrar";
    }

    @Operation(summary = "Remover uma venda")
    @RequestMapping("/listarTodos")
    public String listarTodos() {
        return "vendas/listarTodos";
    }

    @Operation(summary = "Buscar uma venda")
    @RequestMapping("/listarPorId")
    public String listarPorId() {
        return "vendas/listarPorId";
    }

    @Operation(summary = "Filtrar vendas")
    @RequestMapping("/listarPorNome")
    public String listarPorNome() {
        return "vendas/listarPorNome";
    }

    @Operation(summary = "Remover uma venda")
    @RequestMapping("/listarPorData")
    public String listarPorData() {
        return "vendas/listarPorData";
    }

    @Operation(summary = "Buscar uma venda")
    @RequestMapping("/listarPorValor")
    public String listarPorValor() {
        return "vendas/listarPorValor";
    }

    @Operation(summary = "Filtrar vendas")
    @RequestMapping("/listarPorQuantidade")
    public String listarPorQuantidade() {
        return "vendas/listarPorQuantidade";
    }

    @Operation(summary = "Remover uma venda")
    @RequestMapping("/listarPorCliente")
    public String listarPorCliente() {
        return "vendas/listarPorCliente";
    }

    @Operation(summary = "Buscar uma venda")
    @RequestMapping("/listarPorProduto")
    public String listarPorProduto() {
        return "vendas/listarPorProduto";
    }

    @Operation(summary = "Filtrar vendas")
    @RequestMapping("/listarPorVendedor")
    public String listarPorVendedor() {
        return "vendas/listarPorVendedor";
    }

    @Operation(summary = "Remover uma venda")
    @RequestMapping("/listarPorFormaDePagamento")
    public String listarPorFormaDePagamento() {
        return "vendas/listarPorFormaDePagamento";
    }

}
