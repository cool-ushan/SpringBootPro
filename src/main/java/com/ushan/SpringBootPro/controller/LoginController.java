package com.ushan.SpringBootPro.controller;

import com.ushan.SpringBootPro.controller.domain.LoginDTO;
import com.ushan.SpringBootPro.controller.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller


public class LoginController {
    @RequestMapping("/")
    public String welcome( ) {
        return "login";
    }

    @Autowired
    LoginService loginService;


    @GetMapping("/login")
    public String checkLogin(@RequestBody LoginDTO loginData) {
        return loginService.checkLogin(loginData);

    }


}
