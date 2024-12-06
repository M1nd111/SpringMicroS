package ru.micro.demo.eurekaclient2.http.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main2")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test2";
    }

}
