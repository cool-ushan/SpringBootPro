package com.ushan.SpringBootPro.controller.repositary;

import com.ushan.SpringBootPro.controller.domain.LoginDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoginRepositary extends JpaRepository<LoginDTO,Integer> {

    @Query("FROM LoginDTO WHERE username=?1 and password=?2")
    public LoginDTO loginCheck(String username,String password);
}
