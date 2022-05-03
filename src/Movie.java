package Functions;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    //public static Object MovieUtil;
    private String movie = "Gods must be crazy";

    public Movie(String gods_must_be_crazy) {
    }

    public String getDirector() {
        return movie;
    }

    public boolean isClassic() {
        if(movie.equals("abc"))
            return true;
        return false;
    }

    public static class MovieUtil {
        private String movie = "Gods must be crazy";

        public static List<Movie> createMovies() {
            return new ArrayList<>();
        }
    }
}

