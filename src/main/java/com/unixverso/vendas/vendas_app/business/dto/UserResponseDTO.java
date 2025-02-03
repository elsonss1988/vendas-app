package com.unixverso.vendas.vendas_app.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserResponseDTO {

    @JsonProperty(required = true, value = "name")
    private String name;
    @JsonProperty(required = true, value = "email")
    private String email;
    @JsonProperty(required = true, value = "role")
    private String role;
}
