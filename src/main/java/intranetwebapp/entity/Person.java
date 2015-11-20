package intranetwebapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Person")
public class Person {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="id_person", nullable=false)
	private int id;
	 
	@Column(name="name", nullable=false) 
	private String name;
	
	@Column(name="age", nullable=false) 
	private int age;
	

	@Column(name="password", nullable=false) 
	private String password;
	
	public Person() {
		super();
		
	}
	
	public Person(int id, String name, int age) {
		super();
		
		this.id = id;
		this.name = name;
		this.age = age;
		
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
