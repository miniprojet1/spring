package com.example.demo.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Commissioner;
import com.example.demo.repository.CommissionerRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommissionerService {

    @Autowired
    private CommissionerRepository commissionerRepository;



    public List<Commissioner> getCommissioners() {
        List<Commissioner> lp=new ArrayList<>();
        commissionerRepository.findAll()
                .forEach(lp::add);
        return lp;
    }

    public Commissioner getCommissioner(int id){
       
        return commissionerRepository.findById(id).get();

    }

    public void addCommissioner(Commissioner player){
    	commissionerRepository.save(player);
    }

    public void editCommissioner(Commissioner player, int id) {

    	commissionerRepository.save(player);
    }

    public void deleteCommissioner(int id) {

    	commissionerRepository.deleteById(id);
    }
}	