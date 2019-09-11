package com.ushan.SpringBootPro.controller.viewControllers;

import com.ushan.SpringBootPro.domain.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class LoginView {
    @RequestMapping(value = "/")
    public String checkLogin() {
        return "login.html";

    }

}
