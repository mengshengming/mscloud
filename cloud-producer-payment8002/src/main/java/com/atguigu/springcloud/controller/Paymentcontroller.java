package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonRestful;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName : controller
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/25  12:48
 */

@RestController
public class Paymentcontroller {
    @Resource
    PaymentService paymentService;
    @Value("${server.port}")
    private  String port;

    @PostMapping("/payment/create")
    @ResponseBody
    public CommonRestful createPayment(@RequestBody Payment payment){

        int num = paymentService.createPayment(payment);
        if (num>0){
            CommonRestful commonResult = new CommonRestful(200,"创建成功","port:"+port+"返回："+num);
            return commonResult;
        }else {
            CommonRestful commonResult = new CommonRestful(444,"创建失败","port:"+port+"返回："+num);
            return commonResult;
        }
    }


    @GetMapping("payment/get/{id}")
    @ResponseBody
    public CommonRestful getPaymentById(@PathVariable Long id){

        Payment payment = paymentService.getPaymentById(id);
        if (payment!=null){

            CommonRestful commonResult = new CommonRestful(200,"查询成功","port:"+port+"返回："+payment);
            return commonResult;
        }else {
            CommonRestful commonResult = new CommonRestful(444,"查询失败","port:"+port+"返回：");
            return commonResult;
        }
    }

}
