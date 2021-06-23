package contact;

public class Contact {

	//object fields
	private String contactFirstName;
	private String contactLastName;
	private String phoneNumber;
	private String address;
	private String id;
	
	//constructor
	public Contact(String firstName, String lastName, String phone, String address, String id) throws IllegalArgumentException {
		
		//requirements for each field
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("ID is required and must be 10 characters or less.");
		}
		
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First Name is required and must be 10 characters or less.");
		}
		
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last Name is required and must be 10 characters or less.");
		}
		
		if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Phone Number is required and must be 10 characters.");
		}
		
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Adress is required and must be 30 characters or less.");
		}
		
		contactFirstName = firstName;
		contactLastName = lastName;
		phoneNumber = phone;
		this.address = address;
		this.id = id;
		
	}
	
	//getters and setters
	public String getFirstName() {
		return contactFirstName;
	}
	
	public String getLastName() {
		return contactLastName;
	}
	
	public String getPhoneNum() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getID() {
		return id;
	}
	
	public void setFirstName(String name) {
		contactFirstName = name;
	}
	
	public void setLastName(String name) {
		contactLastName = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhoneNum(String num) {
		phoneNumber = num;
	}
	
	
}
