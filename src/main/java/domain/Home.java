package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Home {

    private Long id;

    private String name;
    
    private int size;
    
    private int nbRoom;
    
    private Person person;
    
//    private List<Device> devices = new ArrayList<Device>();
//
//    private List<Device> heaters = new ArrayList<Device>();

    public Home() {
        this.name = "scoate";
        this.size = 21;
        this.nbRoom = 2;
    }

    public Home(String name) {
        this.name = name;
    }
    
	public Home(String name, int size, int nbRoom) {
		super();
		this.name = name;
		this.size = size;
		this.nbRoom = nbRoom;
	}

//	public Home(String name, int size, int nbRoom, List<Device> devices, List<Device> heaters) {
//		super();
//		this.name = name;
//		this.size = size;
//		this.nbRoom = nbRoom;
//		this.devices = devices;
//		this.heaters = heaters;
//	}

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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNbRoom() {
		return nbRoom;
	}

	@ManyToOne
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void setNbRoom(int nbRoom) {
		this.nbRoom = nbRoom;
	}

//	public List<Device> getDevices() {
//		return devices;
//	}
//
//	public void setDevices(List<Device> devices) {
//		this.devices = devices;
//	}
//
//	public List<Device> getHeaters() {
//		return heaters;
//	}
//
//	public void setHeaters(List<Device> heaters) {
//		this.heaters = heaters;
//	}


}

