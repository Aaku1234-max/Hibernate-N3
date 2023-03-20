package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo{

	public static void main(String[] args) {
		EntityManagerFactory Factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=Factory.createEntityManager();
		em.getTransaction().begin();
		
		//
		Employee emp1=new Employee();
		emp1.setEmpname("Aakanksha Barkale");
		
		Employee emp2=new Employee();
		emp2.setEmpname("shital moule");
		//first address
		Address a1=new Address();
		a1.setPincode(422003);
		a1.setArea("Jatrahotel");
		a1.setCity("Nashik");
		a1.setState("Maharashtra");
		
		//second employee
		Address a2=new Address();
		a2.setPincode(422502);
		a2.setArea("Agaskhind");
		a2.setCity("deolali");
		a2.setState("Maharashtra");
		
		emp2.setAddress(a1);
		emp1.setAddress(a2);
		
		em.persist(emp1);
		em.persist(emp2);
		em.getTransaction().commit();
		System.out.println("Data Added Sucessfully");
		em.close();
		Factory.close();
		

	}

}
