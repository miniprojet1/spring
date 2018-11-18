package com.example.demo.model;

public class Employe {
	private int id_emp; 
	private String nom_emp;
	private String adr_emp;
	private String login_emp;
	private String mot_passe_emp;
	public int getId_emp() {
		return id_emp;
	}
	public void setId_emp(int id_emp) {
		this.id_emp = id_emp;
	}
	public String getNom_emp() {
		return nom_emp;
	}
	public void setNom_emp(String nom_emp) {
		this.nom_emp = nom_emp;
	}
	public String getAdr_emp() {
		return adr_emp;
	}
	public void setAdr_emp(String adr_emp) {
		this.adr_emp = adr_emp;
	}
	public String getLogin_emp() {
		return login_emp;
	}
	public void setLogin_emp(String login_emp) {
		this.login_emp = login_emp;
	}
	public String getMot_passe_emp() {
		return mot_passe_emp;
	}
	public void setMot_passe_emp(String mot_passe_emp) {
		this.mot_passe_emp = mot_passe_emp;
	}
	public Employe(int id_emp, String nom_emp, String adr_emp, String login_emp, String mot_passe_emp) {
		super();
		this.id_emp = id_emp;
		this.nom_emp = nom_emp;
		this.adr_emp = adr_emp;
		this.login_emp = login_emp;
		this.mot_passe_emp = mot_passe_emp;
	}
	

}
