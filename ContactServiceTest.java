package contact;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	
	
	//test addContact
	@Test
	public void testAddContact() {
		
		//set contact service to use in test
		ContactService testContactService = new ContactService();
		
		//get unique ID number
		int newID = testContactService.addContact("Eevee", "Jax", "4803300187", "asdf");
		
		//save the contact object for testing
		Contact testContact = testContactService.getContactByID(newID);
		
		Assertions.assertTrue(testContact != null);
		Assertions.assertTrue(testContact.getFirstName().equals("Eevee"));
		Assertions.assertTrue(testContact.getLastName().equals("Jax"));
		Assertions.assertTrue(testContact.getPhoneNum().equals("4803300187"));
		Assertions.assertTrue(testContact.getAddress().equals("asdf"));
		
	}
	
	//test deleteContact
	@Test
	public void testDeleteContact() {
		
		//set contact service to use in test
		ContactService testContactService = new ContactService();
				
		//get unique ID number
		int newID = testContactService.addContact("Eevee", "Jax", "4803300187", "asdf");
		
		//delete the new contact
		testContactService.deleteContact(newID);
		
		//try to get the deleted contact
		Contact deletedContact = testContactService.getContactByID(newID);
		
		//assert that the newID does not pull a contact object
		Assertions.assertTrue(deletedContact == null);
		
		
	}
	
	//test editContact
	@Test
	public void testEditContact() {
		
		//set contact service to use in test
		ContactService testContactService = new ContactService();
		
		//get unique ID number
		int newID = testContactService.addContact("Eevee", "Jax", "4803300187", "asdf");
		
		//save the contact object for testing
		Contact testContact = testContactService.getContactByID(newID);
		
		//edit the fields of the newly added contact
		testContactService.editContact("Ollie", "Brian", "asdff", "4805551234", newID);
		
		Assertions.assertTrue(testContact.getFirstName().equals("Ollie"));
		Assertions.assertTrue(testContact.getLastName().equals("Brian"));
		Assertions.assertTrue(testContact.getAddress().equals("asdff"));
		Assertions.assertTrue(testContact.getPhoneNum().equals("4805551234"));
		
		
	}
}
