package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Dao.EmployeDao;
import com.example.demo.model.Employe;

import java.util.List;

@RestController
public class EmployeController {

    @Autowired
    private EmployeDao EmployeDao;


        public EmployeDao getEmployeDao() {
		return EmployeDao;
	}

	public void setEmployeDao(EmployeDao EmployeDao) {
		this.EmployeDao = EmployeDao;
	}

		@RequestMapping("/Employe")
        public List<Employe> getAllEmployes(){
           return EmployeDao.getEmploye();
        }

        @RequestMapping("/Employe/{id}")
        public Employe getEmployeById(@PathVariable int id){
            return EmployeDao.getEmploye(id);

        }

        @RequestMapping(method = RequestMethod.POST,value="/Employe")
        public void addEmploye(@RequestBody Employe player){
        	EmployeDao.addEmploye(player);;
        }
        @RequestMapping(method = RequestMethod.PUT,value="/Employe/{id}")
            public void editEmploye(@RequestBody Employe player,@PathVariable int id){
        	EmployeDao.editEmploye(player,id);
            }
    @RequestMapping(method = RequestMethod.DELETE,value="/Employe/{id}")
    public void deleteEmploye(@PathVariable int id){
    	EmployeDao.deleteEmploye(id);
    }
}