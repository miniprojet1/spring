package com.example.demo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categorie;
import com.example.demo.repository.CategorieRepository;

@Service
public class CategorieDao {
	  @Autowired
	    private CategorieRepository categorierepository;



	    public List<Categorie> getCategorie() {
	        List<Categorie> lp=new ArrayList<>();
	        categorierepository.findAll()
	                .forEach(lp::add);
	        return lp;
	    }

	    public Categorie getCategorie(int id){
	       
	        return categorierepository.findById(id).get();

	    }

	    public void addCategorie(Categorie player){
	    	categorierepository.save(player);
	    }

	    public void editCategorie(Categorie player, int id) {

	    	categorierepository.save(player);
	    }

	    public void deleteCategorie(int id) {

	    	categorierepository.deleteById(id);
	    }
}
