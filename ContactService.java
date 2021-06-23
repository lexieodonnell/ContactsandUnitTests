package contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

	List<Contact> contactList = new ArrayList<Contact>();
	
	private int currentID = 0;
	
	
	public int addContact(String firstName, String lastName, String address, String phone) {
		
		//every time we add a contact, increment ID to keep it unique
		currentID += 1;
		String stringID = Integer.toString(currentID);
		
		Contact addContact = new Contact(firstName, lastName, address, phone, stringID);
	
		contactList.add(addContact);
		
		return currentID;
		
	}
	
	
	public boolean deleteContact(int id) {
		
		boolean deletedContact = false;
		
		//search the contact list
		for(int i = 0; i < contactList.size(); i++) {
			String stringID = Integer.toString(currentID);
			
			//if the contact with that unique ID exists
			if(stringID.equals(contactList.get(i).getID())) {
				contactList.remove(i);
				deletedContact = true;
				return deletedContact;
			}
		}
		//if there is no contact with that unique ID
		System.out.println("That ID does not exist.");
		return deletedContact;
	}
	
	
	public void editContact(String firstName, String lastName, String address, String phone, int id) {
		String stringID = Integer.toString(id);
		
		for(int i = 0; i < contactList.size(); i++) {
			//if the ID exists in the contact book
			if(stringID.equals(contactList.get(i).getID())) {
				contactList.get(i).setFirstName(firstName);
				contactList.get(i).setLastName(lastName);
				contactList.get(i).setAddress(address);
				contactList.get(i).setPhoneNum(phone);
			}
		}
		//if the ID does not exist
		System.out.println("That ID does not exist.");
		
	}
	
	
	public Contact getContactByID(int id) {
		String stringID = Integer.toString(id);
		
		for(int i = 0; i < contactList.size(); i++) {
			//if the ID exists in the contact book
			if(stringID.equals(contactList.get(i).getID())) {
				return contactList.get(i);
			}
		}
		//if the ID does not exist, or if the list is empty
		return null;
	}
	
	
}
