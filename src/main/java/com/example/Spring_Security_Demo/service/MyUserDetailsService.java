package com.example.Spring_Security_Demo.service;

import com.example.Spring_Security_Demo.dao.UserRepo;
import com.example.Spring_Security_Demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        User user = userRepo.findByUserName(userName);

        if (user == null) {
            System.out.println("user not found");
            throw new UsernameNotFoundException("User 404");
        }

    }
}
