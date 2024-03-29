package com.ushan.SpringBootPro.services.impl;

import com.ushan.SpringBootPro.domain.LoginDTO;
import com.ushan.SpringBootPro.repositary.LoginRepositary;
import com.ushan.SpringBootPro.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginRepositary loginRepositary;
    @Override
    public String checkLogin(LoginDTO loginData) {

        if(!loginData.getUsername().isEmpty()||!loginData.getPassword().isEmpty()){
            LoginDTO serched =  loginRepositary.loginCheck(loginData.getUsername(),loginData.getPassword());
                if(serched!=null){
                    return "Login Success";
                }else{
                    return "User name and password incorrect !";
                }
        }else{
            return "Enter User name and password";
        }



    }
}
