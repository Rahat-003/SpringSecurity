package com.example.Spring_Security_Demo.service;


import com.example.Spring_Security_Demo.dao.UserRepo;
import com.example.Spring_Security_Demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);


    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println("Encrypted Password: " + user.getPassword());
        return userRepo.save(user);
    }


}
