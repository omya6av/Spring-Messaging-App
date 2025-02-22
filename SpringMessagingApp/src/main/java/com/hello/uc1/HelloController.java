package com.hello.uc1;


import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/uc4")
    public String sayHello(@RequestBody UserDTO userDTO){
        return "Hello "+ userDTO.getFirstName() +" "+ userDTO.getLastName()+ " from bridgeLabz";
    }



}
