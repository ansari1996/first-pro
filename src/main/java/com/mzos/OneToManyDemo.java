package com.mzos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mzos.entity.Actor;
import com.mzos.entity.Movie;


public class OneToManyDemo {
	
	public static void main(String[] args) {
      Configuration conf = new Configuration();
      conf.configure("Resources/hibernate.cfg.xml");
      SessionFactory sf= conf.buildSessionFactory();
      Session session = sf.openSession();
      Transaction tr = session.beginTransaction();
      
      Movie m1 = new Movie("DDLJ");
      Movie m2 = new Movie("Don");
      Movie m3 = new Movie("Pathan");
      Movie m4 = new Movie("Vikky donner");
      Movie m5 = new Movie("Dream girl");
      
      List<Movie> srkMovies = new ArrayList<Movie>();
      List<Movie> ayushmanMovie = new ArrayList<Movie>();
      
      srkMovies.add(m1);
      srkMovies.add(m2);
      srkMovies.add(m3);
      
      ayushmanMovie.add(m4);
      ayushmanMovie.add(m5);
      
      Actor srk = new Actor("Shahruk khan");
      Actor ayushman = new Actor("Ayushman khurana");
      
      srk.setMovies(srkMovies);
      ayushman.setMovies(ayushmanMovie);
      
      session.save(srk);
      session.save(ayushman);
      tr.commit();
      session.close();
      
	}

}
