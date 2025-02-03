package com.unixverso.vendas.vendas_app.infrastructure.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AcessTokenResponse(
                @JsonProperty("access_token") String acessToken,
                @JsonProperty("token_type") String tokenType,
                @JsonProperty("expires_in") Integer expiresIn) {

}