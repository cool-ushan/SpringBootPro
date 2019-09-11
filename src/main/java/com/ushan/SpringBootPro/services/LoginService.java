package com.ushan.SpringBootPro.services;

import com.ushan.SpringBootPro.domain.LoginDTO;

public interface LoginService {

    String checkLogin(LoginDTO loginData);
}
