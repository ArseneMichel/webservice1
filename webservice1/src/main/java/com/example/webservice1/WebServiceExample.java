package com.example.webservice1;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebServiceExample {
    @GetMapping("/")
    public String sayHello(){
        return "Hello from webservice1!";
    }

    @GetMapping("/post")
    public String postHello(){
        return "Post hello ";
    }

    @PutMapping("/put")
    public String putHello(){
        return "Put hello ";
    }

    @DeleteMapping("/delete")
    public String deleteHello(){
        return "Delete hello ";
    }
}