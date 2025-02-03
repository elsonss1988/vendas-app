package com.unixverso.vendas.vendas_app.infrastructure.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.unixverso.vendas.vendas_app.infrastructure.client.dto.AcessTokenRequest;
import com.unixverso.vendas.vendas_app.infrastructure.client.dto.AcessTokenResponse;
import com.unixverso.vendas.vendas_app.infrastructure.client.dto.EmailResponse;
import com.unixverso.vendas.vendas_app.infrastructure.client.dto.RootDTO;

@FeignClient(name = "sendpulse", url = "${sendpulse.url}")
public interface SendPulseClient {

    @PostMapping("/oauth/access_token")
    AcessTokenResponse authorization(@RequestBody AcessTokenRequest acessTokenRequest);

    @PostMapping("/smtp/emails")
    EmailResponse sendEmail(
            @RequestBody RootDTO emailResponse,
            @RequestHeader("Authorization") String token);

}
