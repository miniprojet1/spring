package com.example.demo.model;

public class Panier {
	private int id_panier;
	private int id_client;

	private int id_article;
	private float totale;
	public int getId_panier() {
		return id_panier;
	}
	public void setId_panier(int id_panier) {
		this.id_panier = id_panier;
	}
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	public int getId_article() {
		return id_article;
	}
	public void setId_article(int id_article) {
		this.id_article = id_article;
	}
	public float getTotale() {
		return totale;
	}
	public void setTotale(float totale) {
		this.totale = totale;
	}
	public Panier(int id_panier, int id_client, int id_article, float totale) {
		super();
		this.id_panier = id_panier;
		this.id_client = id_client;
		this.id_article = id_article;
		this.totale = totale;
	}
	

}
