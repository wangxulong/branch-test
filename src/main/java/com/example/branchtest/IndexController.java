package com.example.branchtest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    public String index(String msg){
        return "prod";
    }
}
