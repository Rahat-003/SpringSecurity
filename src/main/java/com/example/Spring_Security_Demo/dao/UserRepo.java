package com.example.Spring_Security_Demo.dao;

import com.example.Spring_Security_Demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String userName);
}
