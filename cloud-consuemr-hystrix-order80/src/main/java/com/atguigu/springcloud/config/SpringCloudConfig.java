package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : SpringCloudConfig
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/27  16:51
 */
@Configuration
public class SpringCloudConfig {

    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
