
package com.example.demo.model;

public class LignePanier {
	private int id_panier;
	private int id_article;
	private int qte_article ;
	public int getId_panier() {
		return id_panier;
	}
	public void setId_panier(int id_panier) {
		this.id_panier = id_panier;
	}
	public int getId_article() {
		return id_article;
	}
	public void setId_article(int id_article) {
		this.id_article = id_article;
	}
	public int getQte_article() {
		return qte_article;
	}
	public void setQte_article(int qte_article) {
		this.qte_article = qte_article;
	}
	public LignePanier(int id_panier, int id_article, int qte_article) {
		super();
		this.id_panier = id_panier;
		this.id_article = id_article;
		this.qte_article = qte_article;
	}
	

}
