package com.hello.uc1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/uc1")
    public String hello(){
        return "Hello from BridgeLabz";
    }
}
