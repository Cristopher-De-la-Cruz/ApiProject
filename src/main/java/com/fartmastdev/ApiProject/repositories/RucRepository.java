package com.fartmastdev.ApiProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fartmastdev.ApiProject.models.RucTable;


public interface RucRepository extends JpaRepository<RucTable, Long> {
    RucTable findByRuc(String ruc);
}
