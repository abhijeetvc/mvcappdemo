package com.springmvcdemo.mvcappdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

    @GetMapping(value="/index")
    public String getIndex(){
        return "index";
    }

    @ResponseBody
    @GetMapping(value="/check")
    public String getData(){
        return "Helloooooo";
    }
}
