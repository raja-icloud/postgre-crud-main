package com.example.crud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.models.User;

public interface UserRepo extends JpaRepository<User, Long> {
    
}
