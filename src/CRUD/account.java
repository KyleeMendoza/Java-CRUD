package CRUD;

public class account {
	private String Fname;
	private String Lname;
	private String Username;
	private String Password;
	
	public account(String firstName, String lastName, String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
		this.setFname(firstName);
		this.setLname(lastName);
	}
	public void setFname(String firstname) {
		this.Fname = firstname;
	}
	public String getFname() {
		return this.Fname;
	}
	public void setLname(String lastname) {
		this.Lname = lastname;
	}
	public String getLname() {
		return this.Lname;
	}
	public void setUsername(String username) {
		this.Username = username;
	}
	public String getUsername() {
		return this.Username;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public String getPassword() {
		return this.Password;
	}
}






















