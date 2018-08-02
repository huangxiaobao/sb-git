package com.hxb.sbgit.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 黄晓宝 on 2018/8/2.
 * Description:
 *
 * @author haung.xiaobao
 * @version 1.0
 */
@RestController
@RequestMapping("/hello2")
public class Hello2Controller {
    @RequestMapping(value = "/say/{name}",method = RequestMethod.GET)
    public Object say(@PathVariable String name){
        return "hello2 "+name;
    }
}
