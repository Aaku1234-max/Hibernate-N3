package org.tnsif.bidirectional;
//program to demonstrate on OneTomay and manyToOne bidirectional association 
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person implements Serializable {
	
	
	public static final long serialVersionUID=1;
@Id
    private Integer adhrno;
    private String name;
	
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="contactNo")
private Contact contact;
//getters and setters
public Integer getAdhrno() {
	return adhrno;
}

public void setAdhrno(Integer adhrno) {
	this.adhrno = adhrno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Contact getContact() {
	return contact;
}

public void setContact(Contact contact) {
	this.contact = contact;
}

public Person() {
	super();
	
}

public Person(Integer adhrno, String name, Contact contact) {
	super();
	this.adhrno = adhrno;
	this.name = name;
	this.contact = contact;
}

@Override
public String toString() {
	return "Person [adhrno=" + adhrno + ", name=" + name + ", contact=" + contact + "]";
}


}
