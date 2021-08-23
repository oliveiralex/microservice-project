package com.iftm.ms.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.ms.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
