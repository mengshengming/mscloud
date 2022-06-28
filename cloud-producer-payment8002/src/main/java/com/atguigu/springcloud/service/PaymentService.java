package com.atguigu.springcloud.service;
import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : PaymentService
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/25  12:45
 */
public interface PaymentService {
    /**
     * 创建一条数据
     * @param payment
     * @return
     */
    int createPayment(Payment payment);

    /**
     * 查询对象，通过id
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id")Long id);
}
