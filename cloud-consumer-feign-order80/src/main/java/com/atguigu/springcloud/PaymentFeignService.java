package com.atguigu.springcloud;

import com.atguigu.springcloud.entities.CommonRestful;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @ClassName : PaymentFeignService
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/26  13:59
 *
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @PostMapping("/payment/create")
    CommonRestful createPayment(@RequestBody Payment payment);

    @GetMapping("/payment/discovery")
     Object discovery();

    @GetMapping("payment/get/{id}")
    CommonRestful getPaymentById(@PathVariable(value = "id") Long id);


    @GetMapping("payment/sleep/{sleepTime}")
    String sleepBySleepTime(@PathVariable("sleepTime") Integer sleepTime);





}
