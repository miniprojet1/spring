package com.example.demo.controller;

import java.util.ArrayList;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.PanierDao;
import com.example.demo.model.Panier;
import com.example.demo.repository.PanierRepository;

import antlr.collections.List;

@RestController
@RequestMapping("/company")
public class PanierController {

	private PanierDao  PanierDao;
	
	
	public PanierDao getPanierDao() {
		return PanierDao;
	}


	public void setPanierDao(PanierDao PanierDao) {
		this.PanierDao = PanierDao;
	}


	/* to save an employee*/
	@PostMapping("/ajout")
	public Panier createEmployee(@Valid @RequestBody Panier emp) {
		return PanierDao.save(emp);
	}
	
	
	/*get all employees*/
	@PostMapping("/Panier")
	public List getAllEmployees(){
		return (List) PanierDao.findAll();
	}
	
	@DeleteMapping("/Panier/{id}")
	public ResponseEntity<Panier> deleteEmployee(@PathVariable(value="id") Long empid){
		
		Panier emp=PanierDao.findOne(empid);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		PanierDao.delete(emp);
		
		return ResponseEntity.ok().build();
		
		
	}

	@PostMapping(value = "/update/{id}")
    public Panier updatePersonne(@PathParam(value = "id") Long id, 
@RequestBody Panier f) {
        if (id != null) {
        	Panier p = PanierDao.findOne(id);
            if (p != null) {
            	PanierDao.save(f);
            }
        }
        return f;
    }

	
	
	

}
