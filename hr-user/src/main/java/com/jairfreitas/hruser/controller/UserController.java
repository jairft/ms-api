package com.jairfreitas.hruser.controller;

import com.jairfreitas.hruser.entities.User;
import com.jairfreitas.hruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping(path = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }
    @GetMapping(path = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email){
        return ResponseEntity.ok().body(service.findByEmail(email));
    }
}
