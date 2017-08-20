package org.demo.service.impl;

import org.demo.service.IDemoService;
import org.springframework.stereotype.Service;

@Service("demoService")

public class DemoServiceImpl implements IDemoService {


    public void demoOut(String x){
        System.out.println("服务测试 ===" + x);
    }

    public void addUser(){
        System.out.println("添加用户");
    }
    public void addProduct(){
//        System.out.println("添加商品");

    }
    public void addCategory(){
//        System.out.println("添加分类");

    }

}
