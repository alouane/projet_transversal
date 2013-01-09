package GCQl.persistenceTestes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import GCQl.hiberneteDAO.CompteDAO;
import GCQl.persistence.Compte;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CompteDAO cdao=(CompteDAO) context.getBean("compteDAO");
		Compte cp = cdao.findByCompteId(1);
		System.out.print("je suis "+cp.getPrenom()  +" "+ cp.getNom());
	}

}
