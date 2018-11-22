package com.example.demo.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Fournisseur;
import com.example.demo.model.Commissioner;
import com.example.demo.repository.FournisseurRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class FournisseurDao {

    @Autowired
    private FournisseurRepository FournisseurRepository;



    public List<Fournisseur> getFournisseur() {
        List<Fournisseur> lp=new ArrayList<>();
        FournisseurRepository.findAll()
                .forEach(lp::add);
        return lp;
    }

    public Fournisseur getFournisseur(int id){
       
        return FournisseurRepository.findById(id).get();

    }

    public void addFournisseur(Fournisseur player){
    	FournisseurRepository.save(player);
    }

    public void editFournisseur(Fournisseur player) {

    	FournisseurRepository.save(player);
    }

    public void deleteFournisseur(int id) {

    	FournisseurRepository.deleteById(id);
    }
}	