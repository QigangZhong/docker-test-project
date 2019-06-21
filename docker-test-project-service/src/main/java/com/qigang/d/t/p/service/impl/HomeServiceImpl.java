package com.qigang.d.t.p.service.impl;

import com.qigang.d.t.p.service.HomeService;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public String index() {
        return "hello, this application is for testing docker...";
    }
}
