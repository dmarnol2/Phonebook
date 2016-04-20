
public class Contact {
	//int id;
	static int count;
	String firstName;
	String lastName;
	String phone;
	
	Contact (String firstName, String lastName, String phone){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		count++;
	}
	
	//used when search method invoked
	void printContact(){
		System.out.println(firstName + " "+ lastName + " "+ phone);
	}
	void printAllContacts(){
		System.out.println(firstName + " "+ lastName + " "+ phone);
	}
}

