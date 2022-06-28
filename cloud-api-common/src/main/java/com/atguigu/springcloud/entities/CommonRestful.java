package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : CommonRestful
 * @Description : 封装前端数据的rest风格的类
 * @Author : 蒙盛铭
 * @Date: 2022/6/24  15:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonRestful<T> {
    private long code;
    private String message;
    private T data;
    public CommonRestful(Long code,String message){
        this(code,message,null);
    }
}
