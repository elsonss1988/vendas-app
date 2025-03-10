package com.unixverso.vendas.vendas_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.unixverso.vendas.vendas_app.business.dto.UserRequestDTO;
import com.unixverso.vendas.vendas_app.business.dto.UserResponseDTO;
import com.unixverso.vendas.vendas_app.business.dto.UserResponseDTORecords;
import com.unixverso.vendas.vendas_app.business.services.UserService;
import com.unixverso.vendas.vendas_app.infrastructure.repository.UserRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping(value = "/usuario")
@RequiredArgsConstructor
@Tag(name = "Usuarios", description = "API para manipulaçâo dos usuários")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Lista Nome de Usuarios")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista usuarios validos"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),

    })
    @GetMapping("/listar")
    public ResponseEntity<List<UserResponseDTO>> listaUsuario() {
        return ResponseEntity.ok().body(userService.findAll());
    }

    @Operation(summary = "Buscar por Email")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    @GetMapping("/buscarEmail/email={email}")
    public ResponseEntity<UserResponseDTORecords> buscarPorEmail(@RequestParam String email) {
        return ResponseEntity.ok().body(userService.findByEmail(email));
    }

    @Operation(summary = "Buscar por Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })

    @GetMapping("/buscarId/{id}")
    public ResponseEntity<UserResponseDTO> buscarPorId(@PathParam(value = "id") Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @Operation(summary = "Cadastrar um novo usuario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario cadastrado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Erro ao cadastrar usuario")
    })

    @PostMapping("/cadastrar")
    public ResponseEntity<UserResponseDTO> cadastrarUsuario(@RequestBody UserRequestDTO request) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/usuario/{id}")
                .buildAndExpand(request.getEmail()).toUri();
        return ResponseEntity.created(uri).body(userService.saveUserDTO(request));
    }

    @PutMapping("path/{id}")
    public ResponseEntity<UserResponseDTORecords> putMethodName(@PathVariable Long id,
            @RequestBody UserRequestDTO request) {

        userService.updateUser(request, id);
        return ResponseEntity.ok().body(userService.updateUser(request, id));
    }

    @Operation(summary = "Deletar usuario por Email")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario deletado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Erro ao deletar usuario")
    })
    @DeleteMapping("/deletar/{email}")
    public ResponseEntity<Boolean> deletarUsuario(@PathVariable String email) {
        return ResponseEntity.noContent().build();
    }

}
