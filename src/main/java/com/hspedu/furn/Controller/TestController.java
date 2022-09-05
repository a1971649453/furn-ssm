package com.hspedu.furn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 金宗文
 * @version 1.0
 */
@Controller
public class TestController {

    @RequestMapping("/hi")
    public String hi(){
        System.out.println("TestController的hi方法");
        return "hi";
    }
}
