package com.spring.exercise.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.exercise.model.Actor;
import com.spring.exercise.model.Genre;
import com.spring.exercise.model.Movie;
import com.spring.exercise.repository.ActorRepository;
import com.spring.exercise.repository.GenreRepository;
import com.spring.exercise.repository.MovieRepository;
import com.sun.tools.javac.jvm.Gen;



@Controller
public class RepositoryController<Genre> {
@Autowired
private GenreRepository genreRepository;

@Autowired
private ActorRepository<Actor> actorRepository;

@Autowired
private MovieRepository movieRepository;

@SuppressWarnings("unchecked")
public <genreRepository> void run() {
	//Inserting
	
	// GenreRepository....
	//Inserting
	
	// GenreRepository....
	Genre g1 = new Genre("Action", null);
	Genre g2 = new Genre("Comedy", null);
	Genre g3 = new Genre("Romantic", null);

	
	//6.	Saving objects of type Genre to the database
	genreRepository.save(g1);
	genreRepository.save(g2);
	genreRepository.save(g3);
	
	// ActorRepository.....
	Actor a1 = new Actor("Salman", "Khan", 1982, null);
	Actor a2 = new Actor("AKshay", "Kumar", 1984, null);
	Actor a3 = new Actor("Anushka", "Sharma", 1995, null);
	Actor a4 = new Actor("Shradha", "Kapoor", 1990, null);
	
	//7.	Saving objects of type Actor to the database
	actorRepository.save(a1);
	actorRepository.save(a2);
	actorRepository.save(a3);
	actorRepository.save(a4);	

	// MovieRepository....
	Movie m1 = new Movie("Ready", 2022, g1, null, null);
	Movie m2 = new Movie("RRR", 2019, g2, null, null);
	Movie m3 = new Movie("Ashiqui", 2020, g3, null, null);
	
	//16.	 adding Movie records to the database
	movieRepository.save(m1);
	movieRepository.save(m2);
	movieRepository.save(m3);
	
	//Displaying
	//9. searching Actor records by name
	System.out.println("\n\n Searching Actor records by name : \n ");
	Actor actor1 = actorRepository.findByName("Akshay");
			
	System.out.println(actor1.getId());
	System.out.println(actor1.getName());
	System.out.println(actor1.getLastName());
	System.out.println(actor1.getYearOfBirth());
	
	//10.	 searching for Actor records by id
	System.out.println("\n\n Searching for Actor records by id : \n ");
	Object actor= actorRepository.findById(1L).get();
	
	System.out.println(((Actor) actor).getId());
	System.out.println(((Actor) actor).getName());
	System.out.println(((Actor) actor).getLastName());
	System.out.println(((Actor) actor).getYearOfBirth());
	
	//11.	 returning all Actor records
	System.out.println("\n\n Returning all Actor records : \n ");
	List<Actor> actor2 = actorRepository.findAll();
	
	actor2.forEach((a) -> {
            System.out.println(a.getId());
            System.out.println(a.getName());
            System.out.println(a.getLastName());
            System.out.println(a.getYearOfBirth());
      });
	
	//8.	removing Actor record by id from the database
	System.out.println("\n\n Removing Actor record by id from the database : \n ");
	
	actorRepository.deleteById(1L);
	
	System.out.println("\n\n Returning all Actor records after removing : \n ");
	List<Actor> actor3 = actorRepository.findAll();
	
	actor3.forEach((a) -> {
        System.out.println(a.getId());
        System.out.println(a.getName());
        System.out.println(a.getLastName());
        System.out.println(a.getYearOfBirth());
	});
	
	//13. searching for Genre records by name
	System.out.println("\n\n Searching for Genre records by name : \n ");
	Genre genre1 = genreRepository.findByName("Comedy");
			
	System.out.println(((Genre) genre1).getId());
	System.out.println(((Genre) genre1).getName());
	
	//14. searching for Genre records by id
	System.out.println("\n\n Searching for Genre records by id : \n ");
	com.spring.exercise.model.Genre genre = genreRepository.findById(1L).get();
	
	System.out.println(genre.getId());
	System.out.println(((Actor) actor).getName());
	
	//15. returning all Genre records
	System.out.println("\n\n Returning all Genre records : \n ");
	List<Genre> genre2 = (List<Genre>) genreRepository.findAll();
	
	genre2.forEach((g) -> {
            System.out.println(((Genre) g).getId());
            System.out.println(((Genre) g).getName());
      });
	
	//12.	 removing Genre records from the database
	System.out.println("\n\n Removing Genre records from the database : \n ");
	
	genreRepository.deleteById(1L);
	
	System.out.println("\n\n Returning all Genre records after removing : \n ");
	List<Genre> genre3 = (List<Genre>) genreRepository.findAll();
	
	genre3.forEach((g) -> {
        System.out.println(((Actor) g).getId());
        System.out.println(((Actor) g).getName());
		});
	
	//18.	 searching Movie records by title
	System.out.println("\n\n Searching Movie records by title : \n ");
	Movie movie1 = movieRepository.findByTitle("Ready");
			
	System.out.println(movie1.getId());
	System.out.println(movie1.getTitle());
	System.out.println(movie1.getYearOfrelease());
	
	//19.  searching for Movie records by id
	System.out.println("\n\n Searching for Movie records by id : \n ");
	Movie movie = movieRepository.findById(1L).get();
	
	System.out.println(movie.getId());
	System.out.println(movie.getTitle());
	System.out.println(movie.getYearOfrelease());
	
	//20.	 returning all Movie records
	System.out.println("\n\n Returning all Movie records : \n ");
	List<Movie> movie2 = movieRepository.findAll();
	
	movie2.forEach((m) -> {
            System.out.println(m.getId());
            System.out.println(m.getTitle());
            System.out.println(m.getYearOfrelease());         
      });
	
	//17.	 removing Movie records from the database
	System.out.println("\n\n Removing Movie records from the database : \n ");
	
	movieRepository.deleteById(1L);
	
	System.out.println("\n\n Returning all Genre records after removing : \n ");
	List<Movie> movie3 = movieRepository.findAll();
	
	movie3.forEach((m) -> {
        System.out.println(m.getId());
        System.out.println(m.getTitle());
        System.out.println(m.getYearOfrelease());     
		});
}
}