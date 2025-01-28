package com.unixverso.vendas.vendas_app.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserResponseDTORecords(
        @JsonProperty("name") String nome,
        @JsonProperty("email") String email,
        @JsonProperty("role") String role) {
}