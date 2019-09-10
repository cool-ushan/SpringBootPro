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
    @Value("${welcome.message:test}")
    private String message = "Hello World";
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "login";
    }

//    @Autowired
//    LoginService loginService;
//
//
//    @GetMapping("/login")
//    public String checkLogin(@RequestBody LoginDTO loginData) {
//        return loginService.checkLogin(loginData);
//
//    }


}
