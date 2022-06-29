package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.ImessageProducerService;;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;


import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName : ImessageProducerServiceImpl
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/29  18:48
 */
@EnableBinding(Source.class) //定义此类为消息发送的管道业务
public class ImessageProducerServiceImpl implements ImessageProducerService {
    @Resource
    private MessageChannel output; //消息发送的管道
    @Override
    public String send() {
        String uuid = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uuid).build());
        System.out.println("******uuid:"+uuid);
        return uuid;
    }
}
