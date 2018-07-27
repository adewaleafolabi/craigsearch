package com.plasticmobile.craiglist.search.service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration()

@ConfigurationProperties(prefix = "parser")
@Data
public class ParserConfig {
    String title;
    String price;
    String location;
    String date;
    String result;
}
