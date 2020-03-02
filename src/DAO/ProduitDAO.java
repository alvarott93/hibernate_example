package DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Produit;

public class ProduitDAO implements IProduitDAO{
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	

	
	public int createProduct(Produit pro) {
		try {
			session.beginTransaction();
			session.saveOrUpdate(pro); // s'il existe deja, mise en jour, sinon il le cree
			session.getTransaction().commit();	
			//  session.close();     //sessionclose es un singleton. si la cerramos una vez, se cierra y si lo vuelvo a llamar esta cerrada
			return 1;
		}
		catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int suprProduct(int id) {
		
		try {
			Produit pr= new Produit();
			pr.setIdProduit(id);
			session.beginTransaction();
			session.delete(pr);
			session.getTransaction().commit();
			// session.close();
			return 1;
		}
		catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}

	}
	

}
