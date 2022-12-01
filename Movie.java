package com.spring.exercise.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "id")
	private String id;
	@Column(name="title")
	private String title;
	
	@Column(name="year_of_release")
	private int  yearOfrelease;
	 
	@ManyToMany(mappedBy="movies")
	private List<Actor> actors= new ArrayList<>();
	
	@ManyToOne
	private Genre genre;
	
	public Movie() {
		super();
		
	}
	public Movie(String string, int i, int g1, List<Actor> actors, Genre genre, String title) {
		super();
		this.id=string;
		this.title=title;
		this.yearOfrelease= g1;
		this.actors= actors;
		this.genre=genre;
	}
	public Movie(String title, int yearOfrelease, Genre g1, Genre genre, List<Actor> actors) {
		super();
		this.title=title;
		this.yearOfrelease=yearOfrelease;
		this.actors=actors;
		this.genre=genre;
		
	}
public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYearOfrelease() {
		return yearOfrelease;
	}
	public void setYearOfrelease(int yearOfrelease) {
		this.yearOfrelease = yearOfrelease;
	}
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public void setId(String id) {
		this.id = id;
	}

public String getId() {
	return id;
}
@Override 
public String toString() {
	return "Movie [id=" + id + ", title=" + title + ", yearOfRelease=" + yearOfrelease + ", actors=" + actors
			+ ", genre=" + genre + "]";
}
}
