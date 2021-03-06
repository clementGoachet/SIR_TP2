package domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Person {
	private Long id;

	private String name;

	private String firstName;

	private String email;
	
	private Person friendOf;

	private List<Home> homes = new ArrayList<Home>();

	private List<Person> friends = new ArrayList<Person>();


	public Person() {
		this.name = "Le Boulch";
		this.firstName = "Florent";
		this.email = "Test@Grr";
	}

	public Person(String name, String firstName, String email) {
		this.name = name;
		this.firstName = firstName;
		this.email = email;
	}

	public Person(String name, String firstName, String email, List<Home> homes, List<Person> friends, Person friendOf) {
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.homes = homes;
		this.friends = friends;
		this.friendOf = friendOf;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	@ManyToOne
	public Person getFriendOf() {
		return friendOf;
	}

	public void setFriendOf(Person friendOf) {
		this.friendOf = friendOf;
	}

	@OneToMany(mappedBy = "friendOf", cascade = CascadeType.PERSIST)
	public List<Person> getFriends() {
		return friends;
	}

	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}
	
	public void addFriend(Person friend){
		friend.setFriendOf(this);
		this.friends.add(friend);
	}

	@OneToMany(mappedBy = "person", cascade = CascadeType.PERSIST)
	public List<Home> getHomes() {
		return homes;
	}

	public void setHomes(List<Home> homes) {
		this.homes = homes;
	}
	
	public void addHome(Home home){
		home.setPerson(this);
		this.homes.add(home);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

