package com.example.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.models.User;
import com.example.crud.repos.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo userRepo;

    // Get All Users
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // Get User by ID
    public User getUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    // Create or Update User
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    // Delete User by ID
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

}
