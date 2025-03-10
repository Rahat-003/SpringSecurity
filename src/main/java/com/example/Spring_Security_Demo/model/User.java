package com.example.Spring_Security_Demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
    private int id;
    private String username;
    private String password;
}
