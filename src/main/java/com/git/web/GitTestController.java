package com.git.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    @RequestMapping("/git")
    public String git(){
        return "hello git -v1.07 使用ssh连接提交";
    }
    @RequestMapping("/query")
    public String query(){
        return "this is new method --测试远程提交github";
    }
}
