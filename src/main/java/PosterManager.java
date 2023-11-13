public class PosterManager {
    private String[] result = new String[0];
    public int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] movies = new String[result.length + 1];
        System.arraycopy(result, 0, movies, 0, result.length);
        movies[movies.length - 1] = movie;
        this.result = movies;
    }

    public String[] findAll() {
        return result;
    }

    public String[] findLast() {
        int resultLength;
        if (result.length < limit) {
            resultLength = result.length;
        } else {
            resultLength = limit;
        }
        String[] movies = new String[resultLength];
        for (int i = 0; i < movies.length; i++) {
            movies[i] = result[result.length - 1 - i];
        }
        return movies;
    }
}
