package intranetwebapp.model;

import javax.validation.constraints.*;;




public class PersonModel {

	
	private int id;
	
	@Size(min=10, max=100, message="U")
	private String name;
	private int age;
	private String password;
	
	public PersonModel() {
		super();
		
	}
	
	public PersonModel(int id, String name, int age) {
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
