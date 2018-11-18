package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id_cl;
private String nom_cl;
private String login_cl;
private String mot_passe_cl;
private String adresse_cl;
private String mail_cl;
public int getId_cl() {
	return id_cl;
}
public void setId_cl(int id_cl) {
	this.id_cl = id_cl;
}
public String getNom_cl() {
	return nom_cl;
}
public void setNom_cl(String nom_cl) {
	this.nom_cl = nom_cl;
}
public String getLogin_cl() {
	return login_cl;
}
public void setLogin_cl(String login_cl) {
	this.login_cl = login_cl;
}
public String getMot_passe_cl() {
	return mot_passe_cl;
}
public Client(int id_cl, String nom_cl, String login_cl, String mot_passe_cl, String adresse_cl, String mail_cl) {
	super();
	this.id_cl = id_cl;
	this.nom_cl = nom_cl;
	this.login_cl = login_cl;
	this.mot_passe_cl = mot_passe_cl;
	this.adresse_cl = adresse_cl;
	this.mail_cl = mail_cl;
}
public void setMot_passe_cl(String mot_passe_cl) {
	this.mot_passe_cl = mot_passe_cl;
}
public String getAdresse_cl() {
	return adresse_cl;
}
public void setAdresse_cl(String adresse_cl) {
	this.adresse_cl = adresse_cl;
}
public String getMail_cl() {
	return mail_cl;
}
public void setMail_cl(String mail_cl) {
	this.mail_cl = mail_cl;
}
}
