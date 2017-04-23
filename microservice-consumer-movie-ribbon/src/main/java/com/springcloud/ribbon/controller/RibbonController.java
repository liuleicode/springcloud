package com.springcloud.ribbon.controller;

import com.springcloud.ribbon.model.User;
import com.springcloud.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liulei on 2017/4/23.
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @RequestMapping("/find1")
    public User findUser(){

        return ribbonService.findById(1L);
    }
}
