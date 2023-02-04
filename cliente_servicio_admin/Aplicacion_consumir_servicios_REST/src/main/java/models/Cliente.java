package models;

public class Cliente {
	
	private String name;
    private String lastname;
    private String email;
    private String phone;
    private String username;
    private String password;

	public Cliente()
	{
	}
	public Cliente(String name, String lastname, String email, String phone, String username, String password) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.phone =phone;
		this.username =username;
		this.password = password;
	}

	public String getUsername(){
		return username;
	}	
	public void setUsername(String username){
		this.username = username;
	}

	public String getPhone(){
		return phone;
	}	
	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password =password;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}