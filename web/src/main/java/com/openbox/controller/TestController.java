package com.openbox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author: luming.shi   Created on 18/2/1.
 */
@RestController
public class TestController {

    @RequestMapping("test/Hi")
    public String sayHi(@RequestParam("name")String name) {
        return name + " hi!";
    }
}
