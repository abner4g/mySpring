package br.com.spring.springBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class myController {

    @GetMapping("/resource")
    public String getResource(@RequestParam("name") String name){
        return "hello, " + name + "! This is the resource";
    }

}
