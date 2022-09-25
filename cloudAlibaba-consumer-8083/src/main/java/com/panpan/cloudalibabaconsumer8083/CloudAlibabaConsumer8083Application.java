package com.panpan.cloudalibabaconsumer8083;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @className: CloudAlibabaConsumer8083Application
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/9/18 18:26
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaConsumer8083Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumer8083Application.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
