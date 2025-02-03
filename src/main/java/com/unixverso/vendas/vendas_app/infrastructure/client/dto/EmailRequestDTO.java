package com.unixverso.vendas.vendas_app.infrastructure.client.dto;

import java.util.ArrayList;

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

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/*
 * ObjectMapper om = new ObjectMapper();
 * Root root = om.readValue(myJsonString, Root.class);
 */
public class EmailRequestDTO {
    public String html;
    public String text;
    public String subject;
    public DataEmailRequest from;
    public ArrayList<DataEmailRequest> to;
}
