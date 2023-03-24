package com.jairfreitas.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jairfreitas.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
