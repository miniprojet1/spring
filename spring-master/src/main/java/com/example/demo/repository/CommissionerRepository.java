package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Commissioner;
import com.example.demo.model.Employe;

public interface CommissionerRepository extends JpaRepository<Commissioner,Integer>  {

}
