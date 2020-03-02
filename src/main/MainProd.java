package main;

import DAO.ProduitDAO;
import model.Produit;

public class MainProd {
	
	public static void main(String[] args) {
		
		Produit pr = new Produit("ordinateur", "Core_I7");
		ProduitDAO proDao = new ProduitDAO();
		proDao.createProduct(pr);
        proDao.suprProduct(1);
		
	}

}
