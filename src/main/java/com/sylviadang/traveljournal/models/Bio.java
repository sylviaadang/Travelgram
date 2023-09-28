package com.sylviadang.traveljournal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="bio")
public class Bio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=2, max=255, message="First name must be provided")
	private String firstName;
	
	@NotBlank
	@Size(min=2, max=255, message="Last name must be provided")
	private String lastName;
	
	@NotBlank
	@Size(min=2, max=255, message="About me must be provided")
	private String aboutMe;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	public Bio() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
