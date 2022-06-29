package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;


/**
 * @ClassName : ConsumerCoutroller
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/29  19:19
 */
@Component
@EnableBinding(Sink.class)
public class ConsumerCoutroller {
    @Value("${server.port}")
    private String servicePort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费消息："+message.getPayload()+ "\t  serviceport:"+servicePort);

    }

}
