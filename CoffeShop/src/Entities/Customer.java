package Entities;


import Abstract.IEntity;


public class Customer implements IEntity{
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirh;
	private String nationalityId;
	public Customer(int id, String firstName, String lastName, int dateOfBirh, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirh = dateOfBirh;
		this.nationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirh() {
		return dateOfBirh;
	}
	public void setDateOfBirh(int dateOfBirh) {
		this.dateOfBirh = dateOfBirh;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
	
}
