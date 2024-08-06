
package com.fartmastdev.ApiProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fartmastdev.ApiProject.models.DniTable;

@Repository
public interface DniRepository extends JpaRepository<DniTable, Long> {
    DniTable findByDni(String dni);
}