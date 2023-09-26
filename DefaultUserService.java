package com.example.demo;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);


}
