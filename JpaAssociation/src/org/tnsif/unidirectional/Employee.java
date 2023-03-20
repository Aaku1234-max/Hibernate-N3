package org.tnsif.unidirectional;
import java.io.Serializable;

//program to demonstrate on OneToOne unidirectional association 
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee implements Serializable {
	
	
	public static final long serialVersionUID=1;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer empid;
	private String empname;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pincode")
	private Address address;
	
	//Getters and Setters
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	//default constructor
	public Employee() {
		super();
	}
	
	//parameterized constructor
	public Employee(Integer empid, String empname, Address address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.address = address;
	}
	

	
	

}
