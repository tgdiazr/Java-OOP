/*
Student Name: Tania Diaz
Date: 11/15/2025
Description: This program implements an Address Book using ArrayList. 
             Users can add contacts, save to file, read from file, and search by name.
Time Spent: 3 hours
Honor Code: I pledge that this program represents my own program code.
            I received help from no one in designing and debugging my program.
*/

package ContactList;

import java.io.Serializable;

public class ContactList implements Serializable {
	
	//Fields
	
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
		

	//Constructor
	public ContactList(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	//getters&setters
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ContactList [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone="
				+ phone + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
