package com.example.demo.model;



import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@ManyToOne
    @JoinColumn(name = "id_Categorie")
	private Categorie categorie;
	private int qte_article;
	@ManyToOne
    @JoinColumn(name = "id_Fournisseur")
	private Fournisseur fournisseur;
	@OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private Set<Commande> commandes;
	public Set<Commande> getCommandes() {
		return commandes;
	}



	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}



	public int getId() {
		return id;
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

	public int getQte_article() {
		return qte_article;
	}
	public void setQte_article(int qte_article) {
		this.qte_article = qte_article;
	}



	public Categorie getCategorie() {
		return categorie;
	}



	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}



	public Fournisseur getFournisseur() {
		return fournisseur;
	}



	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}



	public Article(int id, Double prix_article, String nom_article, Categorie categorie, int qte_article,
			Fournisseur fournisseur) {
		super();
		this.id = id;
		this.prix_article = prix_article;
		this.nom_article = nom_article;
		this.categorie = categorie;
		this.qte_article = qte_article;
		this.fournisseur = fournisseur;
	}
	
	
	
	
	



}
