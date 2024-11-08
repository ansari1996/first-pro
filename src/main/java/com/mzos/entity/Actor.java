package com.mzos.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String actorName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="actor_id")
	private List<Movie> movies;
	
	
	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public Actor() {
		super();
	}

	public Actor(String actorName) {
		super();
		this.actorName = actorName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", actorName=" + actorName + "]";
	}
	
	
	
	

}
