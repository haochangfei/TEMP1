package cn.hcf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器类
@Controller
public class HelloController {

    /**
     * 入门程序
     * @return
     */
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello SpringMVC");
        return "success";
    }

    /**
     * RequestMapping讲解
     * @return
     */
    @RequestMapping(path = "/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return "success";
    }


}
