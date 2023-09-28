package com.sylviadang.traveljournal.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="posts")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=2, max=255, message="Image link must be provided")
	private String image;
	
	@NotBlank
	@Size(min=2, max=255, message="Caption must be between 1 and 255 characters")
	private String caption;
	
	
	@NotBlank
	@Size(min=2, max=255, message="Location must be between 2 and 255 characters")
	private String location;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User poster;
	
	@Column(updatable = false)
	private Date createdAt;
	
	private Date updatedAt;
	
	public Post() {}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCaption() {
		return caption;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public void setCaption(String caption) {
		this.caption = caption;
	}



	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	
	public User getPoster() {
		return poster;
	}

	public void setPoster(User poster) {
		this.poster = poster;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	
	
}

