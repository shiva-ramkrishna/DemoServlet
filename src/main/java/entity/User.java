package entity;
// db=demo
// create table user (id int(3) NOT NULL AUTO_INCREMENT, name varchar(120) NOT NULL, email varchar(220) NOT NULL, country varchar(120), PRIMARY KEY (id));

public class User {
	int id;
	String name;
	String email;
	String country;
	
	public User( String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
	}
	public User(int id, String name, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
	}
	public User()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", country=" + country + "]";
	}

}
