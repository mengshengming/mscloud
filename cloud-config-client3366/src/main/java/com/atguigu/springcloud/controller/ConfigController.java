package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : ConfigController
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/28  23:53
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${config.info}")
    String configInfo;


    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }

}
