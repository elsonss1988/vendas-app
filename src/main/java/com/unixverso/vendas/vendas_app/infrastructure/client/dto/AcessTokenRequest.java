package com.unixverso.vendas.vendas_app.infrastructure.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AcessTokenRequest(
        @JsonProperty("grant_type") String grantType,
        @JsonProperty("client_id") String clientId,
        @JsonProperty("client_secret") String clientSecret) {

}
