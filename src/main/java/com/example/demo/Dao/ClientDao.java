package com.example.demo.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;


import java.util.ArrayList;
import java.util.List;

@Service
public class ClientDao {

    @Autowired
    private ClientRepository clientRepository;



    public List<Client> getClients() {
        List<Client> lp=new ArrayList<>();
        clientRepository.findAll()
                .forEach(lp::add);
        return lp;
    }

    public Client getClient(int id){
       
        return clientRepository.findById(id).get();

    }

    public void addClient(Client player){
    	clientRepository.save(player);
    }

    public void editClient(Client player, int id) {

    	clientRepository.save(player);
    }

    public void deleteClient(int id) {

    	clientRepository.deleteById(id);
    }
}	