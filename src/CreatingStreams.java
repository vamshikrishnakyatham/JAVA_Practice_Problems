package Streams;

import Functions.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
    private void testCollectionStream(){
        List<Movie> movies = Movie.MovieUtil.createMovies();
        movies.stream().forEach(System.out::println);
    }
    private void testEmptyStreams(){
        Stream<Movie> movieEmptyStream = Stream.empty();
        System.out.println("Empty stream : "+movieEmptyStream.count());
    }
    private void testStreamsFromValue(){
        Stream<String> movieNames = Stream.of("Gods Must Be Crazy","Fiddler On The Roof");
        System.out.println(movieNames.count());

        String[] movieNames2 = {"Gods Must Be Crazy","Fiddler On The Roof"};
        Stream<String> mNames2 = Stream.of(movieNames2);
    }
    private void testFileStream(){
        try {
            Stream<String> fileLines = Files.lines(Paths.get("/Users/santh/sessions"));
            fileLines.forEach(System.out::println);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    private void testGenerateIterateStreams(){
        Stream<Double> randomStream = Stream.generate(Math::random);
        //randomStream.forEach(System.out::println);
        Stream<Integer> wholeNumbers = Stream.iterate(1,i -> (i+1) );
        //wholeNumbers.forEach(System.out::println);
    }
    public static void main(String[] args){
        new CreatingStreams().testEmptyStreams();
        new CreatingStreams().testStreamsFromValue();
        new CreatingStreams().testFileStream();
        new CreatingStreams().testGenerateIterateStreams();
    }
}
