package com.unixverso.vendas.vendas_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vendas")
public class VendasController {

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "vendas/cadastro";
    }

    @RequestMapping("/listar")
    public String listar() {
        return "vendas/lista";
    }

    @RequestMapping("/editar")
    public String editar() {
        return "vendas/editar";
    }

    @RequestMapping("/excluir")
    public String excluir() {
        return "vendas/excluir";
    }

    @RequestMapping("/salvar")
    public String salvar() {
        return "vendas/salvar";
    }

    @RequestMapping("/atualizar")
    public String atualizar() {
        return "vendas/atualizar";
    }

    @RequestMapping("/remover")
    public String remover() {
        return "vendas/remover";
    }

    @RequestMapping("/buscar")
    public String buscar() {
        return "vendas/buscar";
    }

    @RequestMapping("/filtrar")
    public String filtrar() {
        return "vendas/filtrar";
    }

    @RequestMapping("/listarTodos")
    public String listarTodos() {
        return "vendas/listarTodos";
    }

    @RequestMapping("/listarPorId")
    public String listarPorId() {
        return "vendas/listarPorId";
    }

    @RequestMapping("/listarPorNome")
    public String listarPorNome() {
        return "vendas/listarPorNome";
    }

    @RequestMapping("/listarPorData")
    public String listarPorData() {
        return "vendas/listarPorData";
    }

    @RequestMapping("/listarPorValor")
    public String listarPorValor() {
        return "vendas/listarPorValor";
    }

    @RequestMapping("/listarPorQuantidade")
    public String listarPorQuantidade() {
        return "vendas/listarPorQuantidade";
    }

    @RequestMapping("/listarPorCliente")
    public String listarPorCliente() {
        return "vendas/listarPorCliente";
    }

    @RequestMapping("/listarPorProduto")
    public String listarPorProduto() {
        return "vendas/listarPorProduto";
    }

    @RequestMapping("/listarPorVendedor")
    public String listarPorVendedor() {
        return "vendas/listarPorVendedor";
    }

    @RequestMapping("/listarPorFormaDePagamento")
    public String listarPorFormaDePagamento() {
        return "vendas/listarPorFormaDePagamento";
    }

}
