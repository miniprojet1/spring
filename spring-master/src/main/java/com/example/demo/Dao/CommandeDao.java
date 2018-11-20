package com.example.demo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Commande;
import com.example.demo.repository.CommandeRepository;
@Service

public class CommandeDao {
	  @Autowired
	    private CommandeRepository commanderepository;



	    public List<Commande> getCommande() {
	        List<Commande> lp=new ArrayList<>();
	        commanderepository.findAll()
	                .forEach(lp::add);
	        return lp;
	    }

	    public Commande getCommande(int id){
	       
	        return commanderepository.findById(id).get();

	    }

	    public void addCommande(Commande player){
	    	commanderepository.save(player);
	    }

	    public void editCommande(Commande player, int id) {

	    	commanderepository.save(player);
	    }

	    public void deleteCommande(int id) {

	    	commanderepository.deleteById(id);
	    }
}
