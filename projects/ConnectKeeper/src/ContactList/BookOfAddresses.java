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

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BookOfAddresses {
	
	// ArrayList to store contacts
	ArrayList<ContactList> contacts;
	
	String ADDRESSES = "address.ser";//write data to file
	
	//add new contact constructor
	
	public BookOfAddresses() {
		super();
		contacts = new ArrayList<ContactList>();
	}
	
	// Constructor with pre-existing contact list
	public BookOfAddresses(ArrayList<ContactList> contacts) {
		super();
		this.contacts = contacts;
	}
	
	//Getter and Setter for contacts
	
    public ArrayList<ContactList> getContacts(){
		return contacts;}
	
	
	public void setContacts(ArrayList<ContactList>contacts) {
		this.contacts = contacts;
	
		
	}
	@SuppressWarnings("unchecked")
	public void readBookOfAddresses() {
	    try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(ADDRESSES))) {
	        contacts = (ArrayList<ContactList>) input.readObject();
	    } catch (EOFException e) {
	    } catch (FileNotFoundException e) {
	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	}
	
    // Saves the contacts ArrayList to file
	public void saveBookOfAddresses() {
	    try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(ADDRESSES))) {
	        output.writeObject(contacts); // Save the contact list
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
		}
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("AddressBook:\n");
	    for (ContactList c : contacts) {
	        sb.append(c).append("\n");
	    }
	    return sb.toString();
	
	}
	
	public void printBookofAddresses() {
		for(ContactList c:contacts) {
			System.out.println(c);
		}
		}
			
	
	/*
	 * create method to search through contacts
	 * 
	 * */
	public ContactList searchByName(String name) {
	    for (ContactList c : contacts) {
	        if (c.getFirstName().equalsIgnoreCase(name) ||
	            c.getLastName().equalsIgnoreCase(name)) {
	            return c;
	        }
	    }
	    return null;
	}
	
	//String firstName, String lastName, String email, String phone
	public static void main(String[] args) {
		
		//create a new contact, test code
		ContactList a = new ContactList("Tania","Diaz","tgdiazr@gmail.com","5053362350");
		ContactList d = new ContactList("Max","Cruz","MC@gmail.com","5053333665");
		ContactList c = new ContactList("Will","Montoya","WM@gmail.com","505125030");
		
		BookOfAddresses b = new BookOfAddresses();
		
		b.getContacts().add(a);//add contact
		b.getContacts().add(d);//add contact
		b.getContacts().add(c);//add contact
		
		b.saveBookOfAddresses();//output object to file
		
		b.readBookOfAddresses();//read file
		
		//b.printBookOfAddresses();//print file
		
		
		System.out.println(b);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name to search: ");
		String nameToSearch = scanner.nextLine();

		ContactList result = b.searchByName(nameToSearch);
		if (result != null) {
		    System.out.println("Contact found: " + result);
		} else {
		    System.out.println("No contact found with that name.");
		}

		scanner.close();

		

	}

}
