package GCQl.hiberneteDAO;

import GCQl.persistence.Compte;

public interface ICompteDAO {

		public void insert(Compte cp);
		public void update(Compte cp);
		public void delete(Compte cp);
		public Compte findByCompteId(int cpId);
		
}
