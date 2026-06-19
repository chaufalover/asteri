package com.conex.asteri.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

//Se encarga de leer la configuracion del properties :baseUrl
@Data
@ConfigurationProperties(prefix = "xui")
public class XuiProperties {

    private String baseUrl;

}
