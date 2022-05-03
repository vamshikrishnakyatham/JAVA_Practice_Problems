package Functions;

import Lambdas.ConstructorReference;

import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    Consumer<Movie> printInfo = m -> System.out.println("Printing out movie info"+m);
    Consumer<Movie> persistMovie = m -> persist(m);
    Consumer<Movie> notifyMovie = m -> notify(m);

    public void notify(Movie m) {
        System.out.println("Notifying movie"+m);
    }

    private void persist(Movie m) {
        System.out.println("Persisting movie"+m);
    }

    private void testConsumer(Movie movie){
        printInfo.accept(movie);
        persistMovie.accept(movie);
    }
    public void testAndThen(Movie movie){
        Consumer<Movie> printAndPersistMovie = persistMovie.andThen(printInfo);
        printAndPersistMovie.accept(movie);
        Consumer<Movie> chainedConsumer = notifyMovie.andThen(persistMovie).andThen(printInfo);
        chainedConsumer.accept(movie);
    }
    public static void main(String[] args){
        Movie movie = new Movie("Gods must be crazy");
        new ConsumerFunctionalInterface().testConsumer(movie);
        new ConsumerFunctionalInterface().testAndThen(movie);
    }

}
