package api.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import api.domain.Category;


public class CategoryDao implements ICategoryDao {
	
	@Override
	public List<Category> getAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("immo-api");
		EntityManager em = emf.createEntityManager();
		
		List<Category> categories = new ArrayList<Category>();
		try {
			categories = em.createQuery("SELECT c FROM Category c", Category.class).getResultList();
//			daoLogger.info("module dao , liste etudiants récuperer");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			daoLogger.info("module dao , liste etudiants  nonnrécuperer");

		}
		
		
		return categories;
		
//		return em.createQuery("SELECT c FROM Category c", Category.class).getResultList();
	}
	
}
