package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.PaymentFeignService;
import com.atguigu.springcloud.entities.CommonRestful;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : OfenfeignController
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/26  14:07
 */
@RestController
public class OfenfeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonRestful getPaymentById(@PathVariable(value = "id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/create")
    public CommonRestful createPayment( Payment payment){
        return  paymentFeignService.createPayment(payment);
    }

    @GetMapping("/consumer/payment/sleep/{sleepTime}")
    public String sleepBySleepTime(@PathVariable("sleepTime") Integer sleepTime){
        return paymentFeignService.sleepBySleepTime(sleepTime);
    }
}
