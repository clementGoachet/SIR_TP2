package jpa;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.Device;
import domain.Home;
import domain.Person;

public class JpaTest {

	private EntityManager manager;
	
	public JpaTest(EntityManager manager){
		this.manager = manager;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);
		
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {


			// Person
			Person p = new Person();
			p.setName("martin");
			p.setFirstName("Florent");
			p.setEmail("@.fr");		
			
			// Friends
			Person f1 = new Person();
			
			// Home
			Home myHome = new Home();
			myHome.addDevice(new Device("frigo", 100));
			myHome.addheater(new Device("cuisine", 20));
			myHome.addheater(new Device("salon", 50));
			p.addHome(myHome);
			
			// home 2
			Home hisHome = new Home();
			hisHome.addDevice(new Device("frigo", 85));
			hisHome.addheater(new Device("cuisine", 35));
			hisHome.addheater(new Device("salon", 55));
			f1.addHome(hisHome);
			
			p.addFriend(f1);
			f1.addFriend(p);
			manager.persist(p);


		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
//		String s = "SELECT e FROM Person as e where e.name=:name";
//
//		Query q = manager.createQuery(s,Person.class);
//		q.setParameter("name", "martin"); 
//		List<Person> res = q.getResultList();
//
//		System.err.println(res.size());
//		System.err.println(res.get(0).getName());

		manager.close();
		factory.close();
	}
	
//	private void createDevices(){
//		myHome.addDevice(new Device("frigo", 100));
//		myHome.addheater(new Device("cuisine", 20));
//		myHome.addheater(new Device("salon", 50));
//	}

}
