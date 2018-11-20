package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Article;
import com.example.demo.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Integer>  {

}
