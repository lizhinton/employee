package beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class employee {
	//variables
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String phone;
	private String position;
	@Autowired
	private Address address;
	
	//constructors
	public employee( ) {
		super();
		position = "cashier";
	}
	
	public employee(String n) {
		super();
		name = n;
	}
	
	public employee(String n, String h, String p) {
		super();
		name = n;
		phone = h;
		position = p;
	}
	
	public employee(int i, String n, String h, String p) {
		super();
		id = i;
		name = n;
		phone = h;
		position = p;
	}
	
	//getters
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getPosition() {
		return position;
	}
	
	//setters
	public void setId(long i) {
		id = i;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setPhone(String h) {
		phone = h;
	}
	
	public void setPosition(String p) {
		position = p;
	}
	
	//methods
	@Override
	public String toString() {
		return "Contact [id = “ + id + “, name=" + name + ", phone=" + phone + ", porition=" + position + "]";
	}
}
