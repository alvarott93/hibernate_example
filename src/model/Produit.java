package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue
	private int idProduit;
	private String nomProduit;
	private String descriptionP;
	
	

	public Produit() {
		super();
	}

	public Produit(String nomProduit, String descriptionP) {
		super();
		this.nomProduit = nomProduit;
		this.descriptionP = descriptionP;
	}
	public Produit(int idProduit, String nomProduit, String descriptionP) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.descriptionP = descriptionP;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getDescriptionP() {
		return descriptionP;
	}

	public void setDescriptionP(String descriptionP) {
		this.descriptionP = descriptionP;
	}

	
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", descriptionP=" + descriptionP
				+ "]";
	}
	
	
	
	

}
