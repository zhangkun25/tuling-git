package com.git.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    @RequestMapping("/git")
    public String git(){
        return "hello git";
    }
}