package com.jairfreitas.hrworker.service;

import com.jairfreitas.hrworker.entities.Worker;
import com.jairfreitas.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository repository;

    public List<Worker> findAll(){
        List<Worker> list = repository.findAll();
        return list;
    }

    public Worker findById(Long id) {
        return repository.findById(id).get();


    }
}
