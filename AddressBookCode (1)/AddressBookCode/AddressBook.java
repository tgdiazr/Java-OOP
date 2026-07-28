package studyArrayLists;
/*
 * use with class Contact
 * 
 * 
 * */


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AddressBook {

	ArrayList<Contact> contacts;
	
	String ADDRESSES = "address.ser";//write data to file
	
	/*no arg
	 * add new contact constructor
	 * */
	public AddressBook() {
		super();
		contacts = new ArrayList<Contact>();
				
	}
	
	
	public AddressBook(ArrayList<Contact> contacts) {
		super();
		this.contacts = contacts;
	}

	
	public ArrayList<Contact> getContacts(){
		return contacts;
		
			
	}
	
	public void setContacts(ArrayList<Contact>contacts) {
		this.contacts = contacts;
	
	}
	
	/*
	
	@SuppressWarnings({ "resource", "unchecked" })
	public void readAddressBook() {
		
		try {
		
		
		ObjectInputStream input= new ObjectInputStream(new FileInputStream(ADDRESSES));
		contacts = (ArrayList<Contact>)input.readObject();
		
		input.close();
		
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			
			e.printStackTrace();
		}
	}
	
	*/
	
	@SuppressWarnings({ "resource", "unchecked" })
	public void readAddressBook() {
		
		//try {
		
		
		
		
		while(true) {
			
		
		try {
			
			ObjectInputStream input= new ObjectInputStream(new FileInputStream(ADDRESSES));
			try {
				contacts = (ArrayList<Contact>)input.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}catch(EOFException e) {
			
			break;
			
		}catch(IOException e) {
			
			e.printStackTrace();
					
			
			}
		}
	
	}
	
	
	public void saveAddressBook(){
		
		try {		
	
		ObjectOutput output  = new ObjectOutputStream(new FileOutputStream(ADDRESSES));
		
		output.close();
		
		}
	
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		catch(IOException e) {
	
			e.printStackTrace();
		
		}
		
	}
	

	@Override
	public String toString() {
		return "AddressBook [contacts=" + contacts + ", ADDRESSES=" + ADDRESSES + "]";
	}

	
	public void printAddressBook() {
		
		for(Contact c:contacts) {//loop through
			
			System.out.print(c);
		
		}
		
	}
	
	
	
	/*
	 * create method to search through contacts
	 * 
	 * */
	public Contact searchByName() {
		Contact contact = null;
		
	/*	
		for(Contact c:contacts){
		
		if	
			
		getFristName().equalsIgnoreCase() || getLastName().equalsIgnoreCase()
		
		
		
		}
		
		*/
	
		return contact;
	
	
	}
	
	
	
	
	
	
	//String firstName, String lastName, String email, String phone
	public static void main(String[] args) {
		
		//create a new contact, test code
		Contact c = new Contact("Brad","Pitt","bp@gmail.com","90090210");
		//Contact a = new Contact("Angelina","Jolie","aj@gmail.com","88890210");
		
		
		AddressBook b = new AddressBook();
		
		b.getContacts().add(c);//add contact
		
		b.saveAddressBook();//output object to file
		
		b.readAddressBook();//read file
		
		//b.printAddressBook();//print file
		
		
		System.out.println(b);
		

	}

}
