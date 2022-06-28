package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonRestful;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
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

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for(String service:services){
            System.out.println(service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for(ServiceInstance instance:instances){
            System.out.println("getServiceId:"+instance.getServiceId()+"\t"+"getInstanceId:"+instance.getInstanceId()+"\t"
            +"getInstanceId:"+instance.getInstanceId()+"\t"+"instance:"+instance.getPort()+"\t"+"getUri:"+instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping("payment/sleep/{sleepTime}")
    public String sleepBySleepTime(@PathVariable("sleepTime") Integer sleepTime){
        try { TimeUnit.SECONDS.sleep(sleepTime); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程休眠了"+sleepTime+"秒后继续执行，serverPort:"+port;
    }

}
