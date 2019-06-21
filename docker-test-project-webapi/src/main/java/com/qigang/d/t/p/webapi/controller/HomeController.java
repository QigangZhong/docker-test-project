package com.qigang.d.t.p.webapi.controller;

import com.qigang.d.t.p.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/")
    public String index(){
        return homeService.index();
    }
}
