package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Commande")
@EntityListeners(AuditingEntityListener.class)
public class Commande {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date dateComm;
	private int qte;
	@ManyToOne
    @JoinColumn(name = "id_Article")
	private Article article;
	@ManyToOne
    @JoinColumn(name = "id_Client")
	private Client client;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateComm() {
		return dateComm;
	}
	public void setDateComm(Date dateComm) {
		this.dateComm = dateComm;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Commande(int id, Date dateComm, int qte, Article article, Client client) {
		super();
		this.id = id;
		this.dateComm = dateComm;
		this.qte = qte;
		this.article = article;
		this.client = client;
	}
	
	

}
