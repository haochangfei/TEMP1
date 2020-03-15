package cn.hcf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/param")
public class ParamController {

    @RequestMapping(value = "/testParam")
    public String TestParam(String username){
        System.out.println("请求参数的绑定");
        System.out.println("username:"+username);
        return "success";
    }
}
