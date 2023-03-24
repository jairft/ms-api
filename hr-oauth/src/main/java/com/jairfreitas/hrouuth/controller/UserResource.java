package com.jairfreitas.hrouuth.controller;

import com.jairfreitas.hrouuth.entities.User;
import com.jairfreitas.hrouuth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserResource {
    @Autowired
    private UserService service;
    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email){
        try {
            return ResponseEntity.ok().body(service.findByEmail(email));
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }
}
