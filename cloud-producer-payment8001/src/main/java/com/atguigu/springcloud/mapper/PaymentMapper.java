package com.atguigu.springcloud.mapper;
import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : PaymentMapper
 * @Description :
 * @Author : 蒙盛铭
 * @Date: 2022/6/25  12:31
 */
@Mapper
public interface PaymentMapper {
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
