package EntityDAO;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name = "admin";
	private String password = "admin";
	@OneToMany(mappedBy = "Add", cascade = CascadeType.ALL)
	Set<Customer> cus;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Set<Customer> cus) {
		super();
		this.cus = cus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Customer> getCus() {
		return cus;
	}

	public void setCus(Set<Customer> cus) {
		this.cus = cus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
