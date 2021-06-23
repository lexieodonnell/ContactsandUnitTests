package contact;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {

	//test first name
	@Test
	public void testFirstName() {
		
		Contact add = new Contact("Eevee","Jax","4803300187","asdf","1");
		Assertions.assertEquals("Eevee",add.getFirstName());
	}
	
	@Test
	public void testFirstNameTooLong() {
		boolean exceptionThrown = false;
		
		try{
			new Contact("Eeveeeeeeeeeeee","Jax","4803300187","asdf","1");
		} catch(IllegalArgumentException e) {
			exceptionThrown = true;
		}
		
		Assertions.assertTrue(exceptionThrown);
	}
	
	@Test
	public void testFirstNameNull() {
		boolean exceptionThrown = false;
		
		try{
			new Contact(null,"Jax","4803300187","asdf","1");
		} catch(IllegalArgumentException e) {
			exceptionThrown = true;
		}
		
		Assertions.assertTrue(exceptionThrown);
	}
	
	//test last name
	@Test
	public void testLastName() {
		
		Contact add = new Contact("Eevee","Jax","4803300187","asdf","1");
		Assertions.assertEquals("Jax",add.getLastName());
	}
	
	@Test
	public void testLastNameTooLong() {
		boolean exceptionThrown = false;
		
		try{
			new Contact("Eevee","Jaaaaaaaaaax","4803300187","asdf","1");
		} catch(IllegalArgumentException e) {
			exceptionThrown = true;
		}
		
		Assertions.assertTrue(exceptionThrown);
	}
	
	@Test
	public void testLastNameNull() {
		boolean exceptionThrown = false;
		
		try{
			new Contact("Eevee",null,"4803300187","asdf","1");
		} catch(IllegalArgumentException e) {
			exceptionThrown = true;
		}
		
		Assertions.assertTrue(exceptionThrown);
	}
	
	//test phone number
	@Test
	public void testPhoneNum() {
		
		Contact add = new Contact("Eevee","Jax","4803300187","asdf","1");
		Assertions.assertEquals("4803300187",add.getPhoneNum());
	}
	
	@Test
	public void testPhoneNumLength() {
		boolean exceptionThrown = false;
		
		try{
			new Contact("Eevee","Jax","480330018","asdf","1");
		} catch(IllegalArgumentException e) {
			exceptionThrown = true;
		}
		
		Assertions.assertTrue(exceptionThrown);
	}
	
	@Test
	public void testPhoneNumNull() {
		boolean exceptionThrown = false;
		
		try{
			new Contact("Eevee","Jax",null,"asdf","1");
		} catch(IllegalArgumentException e) {
			exceptionThrown = true;
		}
		
		Assertions.assertTrue(exceptionThrown);
	}
	
	//test address
	@Test
	public void testAddress() {
		
		Contact add = new Contact("Eevee","Jax","4803300187","asdf","1");
		Assertions.assertEquals("asdf",add.getAddress());
	}
	
	@Test
	public void testAddressTooLong() {
		boolean exceptionThrown = false;
		
		try{
			new Contact("Eevee","Jax","4803300187","asdfasdfasdfasdfasdfasdfasdfasdf","1");
		} catch(IllegalArgumentException e) {
			exceptionThrown = true;
		}
		
		Assertions.assertTrue(exceptionThrown);
	}
	
	@Test
	public void testAddressNull() {
		boolean exceptionThrown = false;
		
		try{
			new Contact("Eevee","Jax","4803300187",null,"1");
		} catch(IllegalArgumentException e) {
			exceptionThrown = true;
		}
		
		Assertions.assertTrue(exceptionThrown);
	}
	
	//test ID
	@Test
	public void testID() {
		
		Contact add = new Contact("Eevee","Jax","4803300187","asdf","1");
		Assertions.assertEquals("1",add.getID());
	}
	
	@Test
	public void testIDLong() {
		boolean exceptionThrown = false;
		
		try{
			new Contact("Eevee","Jax","4803300187","asdf","12345678910");
		} catch(IllegalArgumentException e) {
			exceptionThrown = true;
		}
		
		Assertions.assertTrue(exceptionThrown);
	}
	
	@Test
	public void testIDNull() {
		boolean exceptionThrown = false;
		
		try{
			new Contact("Eevee","Jax","4803300187","asdf",null);
		} catch(IllegalArgumentException e) {
			exceptionThrown = true;
		}
		
		Assertions.assertTrue(exceptionThrown);
	}
}
