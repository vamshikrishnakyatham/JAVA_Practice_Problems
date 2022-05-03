package Functions;

import java.util.function.Function;

public class FunctionFunctionalInterface {
    Function<String,Movie> createMovieFunction = s -> new Movie(s);
    private void testFunction(String movieName){
        Movie movie = createMovieFunction.apply(movieName);
        System.out.println("Movie is : "+movie);
    }
    public static void main(String[] args){
        new FunctionFunctionalInterface().testFunction("God must be crazy");
    }
}
