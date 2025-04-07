package gesc.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="client")


public class CLIENT implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient ;
	private String name ; 
	private String surname ; 
	private String email ;
	private String phone ;
	@OneToMany(mappedBy = "client" , cascade = CascadeType.ALL)
	private List<ACCOUNT> accounts ;


	
 
	@Override
	public String toString() {
		return "CLIENT [idClient=" + idClient + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", phone=" + phone + "]";
	}

	public Long getIdClient() {
		return idClient;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public List<ACCOUNT> getAccounts() {
		return accounts;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAccounts(List<ACCOUNT> accounts) {
		this.accounts = accounts;
	}
}
