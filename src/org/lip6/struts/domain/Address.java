package org.lip6.struts.domain;

public class Address extends Contact {
	private int id;
	private String street, city, zip, country;
	private Contact contact;

	public Address() {
		this.id = 0;
	}

	public Address(String st, String cit, String zip, String count) {

		this.street = st;
		this.city = cit;
		this.zip = zip;
		this.country = count;
	}
	
	

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public int getId() {
		return this.id;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}