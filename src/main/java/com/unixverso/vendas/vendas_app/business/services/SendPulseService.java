package com.unixverso.vendas.vendas_app.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.unixverso.vendas.vendas_app.infrastructure.client.SendPulseClient;
import com.unixverso.vendas.vendas_app.infrastructure.client.dto.AcessTokenRequest;
import com.unixverso.vendas.vendas_app.infrastructure.client.dto.AcessTokenResponse;
import com.unixverso.vendas.vendas_app.infrastructure.client.dto.EmailResponse;
import com.unixverso.vendas.vendas_app.infrastructure.client.dto.RootDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SendPulseService {

    @Value("${sendpulse.client.id}")
    String clientId;

    @Value("${sendpulse.client.secret}")
    String clientSecret;

    @Autowired
    private SendPulseClient sendPulseClient;

    public AcessTokenResponse acessTokenResponse() {
        AcessTokenRequest acessTokenRequest = new AcessTokenRequest("client_credentials", clientId, clientSecret);
        return sendPulseClient.authorization(acessTokenRequest);
    }

    public EmailResponse toEmail(RootDTO emailRootDTO) {
        return sendPulseClient.sendEmail(emailRootDTO,
                acessTokenResponse().tokenType() + " " + acessTokenResponse().acessToken());
    }
}
