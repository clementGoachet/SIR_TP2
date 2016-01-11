package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Device {

	private Long id;
	
	private String name;
	
	private int conso;
	
	private Home home;
	
	
	public Device() {
	}
	
	public Device(String name, int conso){
		this.name = name;
		this.conso = conso;
	}

	public Device(String name, int conso, Home home) {
		this.name = name;
		this.conso = conso;
		this.home = home;
	}
	
	
    @Id
    @GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getConso() {
		return conso;
	}

	public void setConso(int conso) {
		this.conso = conso;
	}
	
	@ManyToOne
	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}	
}
