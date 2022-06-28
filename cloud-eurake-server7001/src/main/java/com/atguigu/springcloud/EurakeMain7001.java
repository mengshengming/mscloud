package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName : Eurake7001
 * @Description : 注册中心启动类，端口号7001.
 * @Author : 蒙盛铭
 * @Date: 2022/6/25  11:19
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakeMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurakeMain7001.class,args);
    }

}
