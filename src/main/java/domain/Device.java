package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Device {

	private Long id;
	
	private String name;
	
	private int conso;
	
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

	
	
	public Device() {
	}

	public Device(String name, int conso) {
		this.name = name;
		this.conso = conso;
	}
	
	
}
