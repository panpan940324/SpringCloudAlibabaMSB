package com.panpan.cloudalibabaconfig3377.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: ConfigController
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/9/18 19:21
 * @version: 1.0
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/panpan/config/info")
    public String getConfigInfo() {
        return configInfo;
    }

}
