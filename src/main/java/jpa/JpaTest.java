package jpa;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.Home;
import domain.Person;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {


			Person p = new Person();
			p.setName("martin");
			p.setFirstName("Florent");
			p.setEmail("@.fr");
			
//			// Friends
//			Person f1 = new Person();
//			Person f2 = new Person();
//			ArrayList<Person> friends = new ArrayList<Person>();
//			friends.add(f1);
//			friends.add(f2);
//			p.setFriends(friends);
			
			// Home
			ArrayList<Home> homes = new ArrayList<Home>();
			Home myHome = new Home();
			homes.add(myHome);
			p.setHomes(homes);
			
			manager.persist(p);




		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		//		String s = "SELECT e FROM Person as e where e.name=:name";

		//		Query q = manager.createQuery(s,Person.class);
		//		q.setParameter("name", "martin"); 
		//		List<Person> res = q.getResultList();

		//		System.err.println(res.size());
		//		System.err.println(res.get(0).getName());

		manager.close();
		factory.close();
	}

}
