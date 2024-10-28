package com.example.GestionEmployer.Dao;

import com.example.GestionEmployer.Entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
}
