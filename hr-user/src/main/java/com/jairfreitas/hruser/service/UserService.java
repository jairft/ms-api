package com.jairfreitas.hruser.service;

import com.jairfreitas.hruser.entities.User;
import com.jairfreitas.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User findById(Long id){
        User user = repository.findById(id).get();
        return user;
    }

    public User findByEmail(String email) {
        User user = repository.findByEmail(email);
        return user;
    }
}
