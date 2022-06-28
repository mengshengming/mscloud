package com.atguigu.springcloud;

import io.netty.util.DomainNameMappingBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : GatewayMian9527
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/27  22:10
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMian9527 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMian9527.class,args);
    }
}
