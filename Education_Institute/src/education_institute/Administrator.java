package education_institute;

public class Administrator {
	private String Contact;
	private String Role;
	
	public String GetContact() {
		return Contact;
	}
	
	public void SetContact(String newContact) {
		this.Contact = newContact;
	}
	
	public String GetRole() {
		return Role;
	}
	
	public void SetRole(String newRole) {
		this.Role = newRole;
	}
}
