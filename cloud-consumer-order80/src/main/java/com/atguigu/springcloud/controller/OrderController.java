package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonRestful;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName : OrderController
 * @Description : 以项目名字的业务部分命名
 * @Author : 蒙盛铭
 * @Date: 2022/6/24  21:15
 */
@RestController
@ResponseBody
public class OrderController {

    //private final String PAYMENT_SVR_URL="http://localhost:8001/";
    private final String PAYMENT_SVR_URL="http://CLOUD-PAYMENT-SERVICE/";
    @Resource
    RestTemplate restTemplate;


    @GetMapping("/consumer/payment/get/{id}")
    public CommonRestful getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_SVR_URL + "payment/get/"+id,CommonRestful.class,id);
    }

    @GetMapping("/consumer/payment/create")
    public CommonRestful createPayment( Payment payment){
        System.out.println("dsjgasio");
        return restTemplate.postForObject(PAYMENT_SVR_URL + "payment/create",payment,CommonRestful.class);
    }




}
