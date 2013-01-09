package GCQl.hiberneteDAO;

import java.util.List;

import GCQl.persistence.Compte;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class CompteDAO implements ICompteDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void insert(Compte cp) {
	//	sessionFactory.getCurrentSession().	
	}

	public void update(Compte cp) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Compte cp) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public Compte findByCompteId(int cpId) {
		
		List<Compte> cp = sessionFactory.getCurrentSession()
								  .createCriteria(Compte.class)
								  .list();
		
		return cp.get(0);
	}
	
	

}
