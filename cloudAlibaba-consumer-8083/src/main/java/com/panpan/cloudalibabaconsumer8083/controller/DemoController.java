package com.panpan.cloudalibabaconsumer8083.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @className: DemoController
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/9/18 16:59
 * @version: 1.0
 */
@RestController
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${service-url.nacos-user-service}")
    private String serviceURL;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/panpan")
    public String getServerPort() {
        return "Hello Nacos Discovery Consumer" + serverPort;
    }

    @GetMapping("/panpan/getProviderServerPort")
    public String getProviderServerPort() {
        return restTemplate.getForObject(serviceURL + "/panpan", String.class);
    }
}
