package com.ushan.SpringBootPro.controller.services;

import com.ushan.SpringBootPro.controller.domain.LoginDTO;

public interface LoginService {

    String checkLogin(LoginDTO loginData);
}
