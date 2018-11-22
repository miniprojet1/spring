package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Dao.FournisseurDao;
import com.example.demo.model.Fournisseur;

import java.util.List;

@RestController

public class FournisseurController {

    @Autowired
    private FournisseurDao FournisseurDao;


        public FournisseurDao getFournisseurDao() {
		return FournisseurDao;
	}

	public void setFournisseurDao(FournisseurDao FournisseurDao) {
		this.FournisseurDao = FournisseurDao;
	}
		@RequestMapping("/Fournisseur")
        public List<Fournisseur> getAllFournisseurs(){
           return FournisseurDao.getFournisseur();
        }

        @RequestMapping("/Fournisseur/{id}")
        public Fournisseur getFournisseurById(@PathVariable int id){
            return FournisseurDao.getFournisseur(id);
        }

        @RequestMapping(method = RequestMethod.POST,value="/Fournisseur")
        public void addFournisseur(@RequestBody Fournisseur player){
        	FournisseurDao.addFournisseur(player);
        }
        @RequestMapping(method = RequestMethod.PUT,value="/Fournisseur")
            public void editFournisseur(@RequestBody Fournisseur player){
        	FournisseurDao.editFournisseur(player);
            }
    @RequestMapping(method = RequestMethod.DELETE,value="/Fournisseur/{id}")
    public void deleteFournisseur(@PathVariable int id){
    	FournisseurDao.deleteFournisseur(id);
    }
}