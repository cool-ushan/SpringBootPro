package com.ushan.SpringBootPro.controller;

import com.ushan.SpringBootPro.domain.LoginDTO;
import com.ushan.SpringBootPro.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController

public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public String checkLogin(@RequestBody LoginDTO loginData) {
        System.out.println(loginData.getUsername());
       String a = loginService.checkLogin(loginData);
        System.out.println(a+"-------------");

        return a;


    }



}
