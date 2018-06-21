package com.test.demo.controller;


import com.test.demo.service.Special;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecialController {

    @Autowired
    private Special special;


    @GetMapping(value = "/get/results")
    public String getResult(@RequestParam(required = false, defaultValue = "a,b$c") String test)
    {
        char[] charArray = test.toCharArray();
        special.result(charArray);
        return new String(charArray);
    }
}
