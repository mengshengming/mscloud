package com.atguigu.springcloud;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : MainApp80
 * @Description : order-comsumer的入口类
 * @Author : 蒙盛铭
 * @Date: 2022/6/24  21:09
 */
@SpringBootApplication
@EnableEurekaClient
public class MainApp80 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp80.class,args);
    }
}
