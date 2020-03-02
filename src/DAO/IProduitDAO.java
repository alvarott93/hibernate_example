package DAO;

import model.Produit;

public interface IProduitDAO {
	
	public int createProduct(Produit pro);
	public int suprProduct(int id);

}
