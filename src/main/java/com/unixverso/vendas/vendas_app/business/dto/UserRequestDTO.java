package com.unixverso.vendas.vendas_app.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.core.util.Json;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserRequestDTO {

    @JsonProperty(required = true, value = "name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @JsonProperty("role")
    private String role;

}
