package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.Action;

@Controller
@RequestMapping("/mvc")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String getHello(){
        return "hello";
    }
    @RequestMapping("/getInfo")
    public void getInfo(){
        helloService.getInfo();
    }
}
