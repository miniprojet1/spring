package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Dao.ClientDao;
import com.example.demo.model.Client;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientDao ClientDao;


        public ClientDao getClientDao() {
		return ClientDao;
	}

	public void setClientDao(ClientDao ClientDao) {
		this.ClientDao = ClientDao;
	}

		@RequestMapping("/Client")
        public List<Client> getAllClients(){
           return ClientDao.getClients();
        }

        @RequestMapping("/Client/{id}")
        public Client getClientById(@PathVariable int id){
            return ClientDao.getClient(id);
        }

        @RequestMapping(method = RequestMethod.POST,value="/Client")
        public void addClient(@RequestBody Client player){
        	ClientDao.addClient(player);
        }
        @RequestMapping(method = RequestMethod.PUT,value="/Client/{id}")
            public void editClient(@RequestBody Client player,@PathVariable int id){
        	ClientDao.editClient(player,id);
            }
    @RequestMapping(method = RequestMethod.DELETE,value="/Client/{id}")
    public void deleteClient(@PathVariable int id){
    	ClientDao.deleteClient(id);
    }
}