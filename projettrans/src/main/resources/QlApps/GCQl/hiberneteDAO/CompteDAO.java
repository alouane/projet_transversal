package GCQl.hiberneteDAO;

import java.util.List;

import GCQl.persistence.Compte;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Transactional
@Repository
public class CompteDAO extends HibernateDaoSupport implements ICompteDAO {
	
	
	

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
		
		List<Compte> cp =  getHibernateTemplate().find(
                             "from Compte where idcompte=?",cpId
          );
		return cp.get(0);
	}
	
	

}
