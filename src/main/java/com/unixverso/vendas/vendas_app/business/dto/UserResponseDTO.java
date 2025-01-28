package com.unixverso.vendas.vendas_app.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponseDTO {

    @JsonProperty("name")
    private String nome;
    @JsonProperty("email")
    private String email;
    @JsonProperty("role")
    private String papel;
}
