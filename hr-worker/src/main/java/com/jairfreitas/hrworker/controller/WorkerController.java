package com.jairfreitas.hrworker.controller;

import com.jairfreitas.hrworker.entities.Worker;
import com.jairfreitas.hrworker.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/workers")
public class WorkerController {
    @Autowired
    private WorkerService service;
    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Worker> findBuId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }
}
