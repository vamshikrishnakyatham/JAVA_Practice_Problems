package Streams;

import Functions.Movie;

import java.util.List;
import java.util.stream.Stream;

public class LazyAndEagerStreams {
    List<Movie> movies = Movie.MovieUtil.createMovies();
    private void testLazy(){
        movies.stream()
                .filter(m -> {
                    System.out.println("Inside Lazy operation");
                    return m.isClassic() ? true: false;

                }).count();
    }
    private void testEager(){
        Stream<Movie> movieStream=movies.stream()
                .filter(m -> {
                    System.out.println("Filtering");
                    return m.isClassic() ? true: false;

                }).map(s -> {
                    System.out.println("Mapping");
                    return s;
                });
        System.out.println(""+movieStream.count());
    }
    public static void main(String[] args){
        new LazyAndEagerStreams().testEager();
        new LazyAndEagerStreams().testLazy();
    }
}
