package com.example.Spring_Security_Demo.dao;

import com.example.Spring_Security_Demo.model.Student;
import com.example.Spring_Security_Demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUserName(String userName);
}
