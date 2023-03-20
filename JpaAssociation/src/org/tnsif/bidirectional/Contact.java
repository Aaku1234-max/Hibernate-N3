package org.tnsif.bidirectional;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Contact implements Serializable{
	

	public static final long serialVersionUID=1;
@Id
    private Long contactno;
    private String simType;
@OneToMany(mappedBy="contact",cascade=CascadeType.ALL)
    private Set<Person>person=new HashSet<Person>(0);
    //getters and setters
	
	//to string method
	@Override
	public String toString() {
		return "Contact [contactno=" + contactno + ", simType=" + simType + "]";
	}
	public Long getContactno() {
		return contactno;
	}
	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}
	public String getSimType() {
		return simType;
	}
	public void setSimType(String simType) {
		this.simType = simType;
	}
	public Set<Person> getPerson() {
		return person;
	}
	public void setPerson(Set<Person> person) {
		this.person = person;
	}
	//default constructor
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Contact(Long contactno, String simType, Set<Person> person) {
		super();
		this.contactno = contactno;
		this.simType = simType;
		this.person = person;
	}
	
	}
    

