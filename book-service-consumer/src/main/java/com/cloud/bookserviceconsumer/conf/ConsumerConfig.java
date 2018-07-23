package com.cloud.bookserviceconsumer.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud-master
 * @description:
 * @author: 001977
 * @create: 2018-07-20 17:53
 */
@Configuration
public class ConsumerConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
