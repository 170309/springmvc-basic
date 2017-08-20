package org.demo.service.impl;

import org.demo.service.IDemoService;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements IDemoService {

    public void sout(){
        System.out.println("服务测试");
    }

}
