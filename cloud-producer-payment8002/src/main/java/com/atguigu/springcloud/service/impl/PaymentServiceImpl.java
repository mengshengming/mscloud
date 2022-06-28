package com.atguigu.springcloud.service.impl;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.mapper.PaymentMapper;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName : PaymentServiceImpl
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/25  12:46
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentMapper paymentMapper;

    @Override
    public int createPayment(Payment payment) {
        return paymentMapper.createPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
