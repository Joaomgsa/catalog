package br.com.faro.catalog.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/")
    public String hello(@RequestParam(value = "name", defaultValue= "World") String name){
        return String.format("Hello %s!", name);
    }

}
