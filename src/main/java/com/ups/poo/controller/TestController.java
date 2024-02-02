package com.ups.poo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test(@RequestParam String name,
                       @RequestParam String lastName) {
        return "Hi World, this is my first SpringBootProject! , and my name is: " + name + " " + lastName;
    }

    @GetMapping("/concat/{name}/{lastName}")
    public String concatenate(@PathVariable String name, @PathVariable String lastName) {
        return "Hi World, this is my second rest service! , and my name is: " + name + " " + lastName;
    }
}
