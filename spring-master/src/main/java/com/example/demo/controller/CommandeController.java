package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.CommandeDao;
import com.example.demo.model.Commande;
@RestController

public class CommandeController {
	 @Autowired
	    private CommandeDao commandedao;


	        public CommandeDao getCommandeDao() {
			return commandedao;
		}

		public void setCommandeDao(CommandeDao commandedao) {
			this.commandedao = commandedao;
		}

			@RequestMapping("/Commande")
	        public List<Commande> getAllCommandes(){
	           return commandedao.getCommande();
	        }

	        @RequestMapping("/Commande/{id}")
	        public Commande getCommandeById(@PathVariable int id){
	            return commandedao.getCommande(id);
	        }

	        @RequestMapping(method = RequestMethod.POST,value="/Commande")
	        public void addCommande(@RequestBody Commande player){
	        	commandedao.addCommande(player);
	        }
	        @RequestMapping(method = RequestMethod.PUT,value="/Commande/{id}")
	            public void editCommande(@RequestBody Commande player,@PathVariable int id){
	        	commandedao.editCommande(player, id);
	            }
	    @RequestMapping(method = RequestMethod.DELETE,value="/Commande/{id}")
	    public void deleteCommande(@PathVariable int id){
	    	commandedao.deleteCommande(id);
	    }
}
