package com.panpan.cloudalibabanacos9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/panpan")
    public String getServerPort() {
        return "Hello Nacos Discovery Provider" + serverPort;
    }
}
