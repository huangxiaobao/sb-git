package com.hxb.sbgit.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Created by 黄晓宝 on 2018/8/2.
 * Description:
 *
 * @author haung.xiaobao
 * @version 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = "/say/{name}",method = RequestMethod.GET)
    public Object say(@PathVariable String name){
        return "hello "+name;
    }
}
