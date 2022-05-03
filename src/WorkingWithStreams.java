package Streams;

import Functions.Movie;

import java.util.List;

public class WorkingWithStreams {
    //private Object MovieUtil;
    List<Movie> movies  = Movie.MovieUtil.createMovies();

     private  void findMoviesByDirector(){
         movies.stream()
                 .filter(m -> m.getDirector().equals("Steven Spielberg")? true: false)
                 .forEach(System.out::println);
     }
     public static void main(String[] args){
         new WorkingWithStreams().findMoviesByDirector();
     }
}
