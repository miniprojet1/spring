package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.CategorieDao;
import com.example.demo.model.Categorie;

@RestController

public class CategorieController {
	 @Autowired
	    private CategorieDao categorie;


	        public CategorieDao getCategorieDao() {
			return categorie;
		}

		public void setCategorieDao(CategorieDao categorie) {
			this.categorie = categorie;
		}

			@RequestMapping("/Categorie")
	        public List<Categorie> getAllCategories(){
	           return categorie.getCategorie();
	        }

	        @RequestMapping("/Categorie/{id}")
	        public Categorie getCategorieById(@PathVariable int id){
	            return categorie.getCategorie(id);
	        }

	        @RequestMapping(method = RequestMethod.POST,value="/Categorie")
	        public void addCategorie(@RequestBody Categorie player){
	        	categorie.addCategorie(player);
	        }
	        @RequestMapping(method = RequestMethod.PUT,value="/Categorie/{id}")
	            public void editCategorie(@RequestBody Categorie player,@PathVariable int id){
	        	categorie.editCategorie(player, id);
	            }
	    @RequestMapping(method = RequestMethod.DELETE,value="/Categorie/{id}")
	    public void deleteCategorie(@PathVariable int id){
	    	categorie.deleteCategorie(id);
	    }
}
