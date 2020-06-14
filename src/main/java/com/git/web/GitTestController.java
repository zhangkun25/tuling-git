package com.git.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    @RequestMapping("/git")
    public String git(){
        return "hello git -v0.6 master update merge 合并分支 ---branch N9";
    }
}
