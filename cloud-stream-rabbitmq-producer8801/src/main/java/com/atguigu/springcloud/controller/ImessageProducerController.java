package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.ImessageProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : ImessageProducerController
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/29  18:59
 */
@RestController
public class ImessageProducerController {
    @Resource
    ImessageProducerService imessageProducerService;

    @GetMapping("/send")
    public String send(){
        String send = imessageProducerService.send();
        return send;
    }
}
