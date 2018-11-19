package com.example.demo.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Article")
@EntityListeners(AuditingEntityListener.class)

public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Double prix_article;
	private String nom_article;
	private String categorie_article;
	private int qte_article;
	
	private int id_fournisseur;
	public int getId() {
		return id;
	}
	
	public int getId_fournisseur() {
		return id_fournisseur;
	}

	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Double getPrix_article() {
		return prix_article;
	}
	public void setPrix_article(Double prix_article) {
		this.prix_article = prix_article;
	}
	public String getNom_article() {
		return nom_article;
	}
	public void setNom_article(String nom_article) {
		this.nom_article = nom_article;
	}
	public String getCategorie_article() {
		return categorie_article;
	}
	public void setCategorie_article(String categorie_article) {
		this.categorie_article = categorie_article;
	}
	public int getQte_article() {
		return qte_article;
	}
	public void setQte_article(int qte_article) {
		this.qte_article = qte_article;
	}
	public Article(int id,  Double prix_article, String nom_article, String categorie_article,
			int qte_article,int id_for) {
		super();
		this.id = id;
		this.prix_article = prix_article;
		this.nom_article = nom_article;
		this.categorie_article = categorie_article;
		this.qte_article = qte_article;
		this.id_fournisseur=id_for;
	}  
	
	
	
	



}
