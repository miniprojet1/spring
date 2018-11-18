package com.example.demo.Dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Panier;
import com.example.demo.model.Fournisseur;

import com.example.demo.repository.FournisseurRepository;
import com.example.demo.repository.PanierRepository;

import antlr.collections.List;

public class PanierDao  {
	@Autowired(required =true)
	PanierRepository panierRepository;
	
	/*to save an fournisseur*/
	
	public Panier save(Panier emp) {
		return panierRepository.save(emp);
	}
/* search all fournisseur*/
	
	public ArrayList<Panier> findAll(){
		return (ArrayList<Panier>) panierRepository.findAll();
	}

	/*delete an employee*/
	
	public void delete(Panier emp) {
		panierRepository.delete(emp);
	}
	
	
	public Panier findOne(long id) {
		return panierRepository.getOne(id);
	}
	
}
