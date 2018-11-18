package com.example.demo.model;

public class Commissioner {
	private int id ;
	private String nom ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Commissioner(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Commissioner() {}
	

}
