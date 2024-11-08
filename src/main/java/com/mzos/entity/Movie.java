package com.mzos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String movieName;
	public Movie() {
		super();
	}
	public Movie(String movieName) {
		super();
		this.movieName = movieName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + "]";
	}
	
	
	
	
	
	
	

}
