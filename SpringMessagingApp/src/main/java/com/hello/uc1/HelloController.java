package com.hello.uc1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/uc1")
    public String hello(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/uc2")
    public String sayHelloWithName(@RequestParam String name ){
        return "Hello " + name + " from BridgeLabz";
    }
}
