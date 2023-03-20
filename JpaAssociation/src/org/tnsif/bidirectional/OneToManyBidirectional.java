package org.tnsif.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.tnsif.unidirectional.Employee;

public class OneToManyBidirectional {

	public static void main(String[] args) {
		EntityManagerFactory Factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=Factory.createEntityManager();
		em.getTransaction().begin();
		
		//person p1
		Person p=new Person();
		p.setAdhrno(722029);
		p.setName("Aakanksha Barkale");
		//person p2
		
		Person p1=new Person();
		p1.setAdhrno(212344);
		p1.setName("narendra modi");
		
		//contact p
		Contact c=new Contact();
		c.setContactno(9527127908L);
		c.setSimType("postpaid");
        //contact p1
		Contact c1=new Contact();
		c1.setContactno(123456985L);
		c1.setSimType("prepaid");
		
		p.setContact(c1);
		p1.setContact(c);
		
		em.persist(p);
		em.persist(args);
	}

}
