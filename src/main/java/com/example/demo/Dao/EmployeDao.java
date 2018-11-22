package com.example.demo.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employe;
import com.example.demo.model.Commissioner;
import com.example.demo.repository.EmployeRepository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeDao {

    @Autowired
    private EmployeRepository EmployeRepository;



    public List<Employe> getEmploye() {
        List<Employe> lp=new ArrayList<>();
        EmployeRepository.findAll()
                .forEach(lp::add);
        return lp;
    }

    public Employe getEmploye(int id){
       
        return EmployeRepository.findById(id).get();

    }
    /*
    public boolean verif(int id ,String mdp) {
    	ResultSet rs = stm.executeQuery("select * from employe where id="+id+",and mot_passe_emp="+mdp);
    	
    }
*/ 
    public void addEmploye(Employe player){
    	EmployeRepository.save(player);
    }

    public void editEmploye(Employe player, int id) {

    	EmployeRepository.save(player);
    }

    public void deleteEmploye(int id) {

    	EmployeRepository.deleteById(id);
    }
}	