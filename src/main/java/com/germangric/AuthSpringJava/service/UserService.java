package com.germangric.AuthSpringJava.service;


import com.germangric.AuthSpringJava.dto.UserRegistrationDto;
import com.germangric.AuthSpringJava.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
    List<User> getAll();
}