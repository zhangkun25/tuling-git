package com.git.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    @RequestMapping("/git")
    public String git(){
        return "hello git -v1.01 master update merge 合并分支 --merge ZHANGKUN";
    }
    @RequestMapping("/query")
    public String query(){
        return "this is new method";
    }
}
