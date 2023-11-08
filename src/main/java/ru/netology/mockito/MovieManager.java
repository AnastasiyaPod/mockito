package ru.netology.mockito;
public class MovieManager {
    private final String[] movies = new String[0];
    private final int limit;
    public MovieManager() {
        this.limit = 5;
    }
    public MovieManager(int limit) {
        this.limit = limit;
    }
    public void addMovie(String movie) {
        String[] temp = new String[movies.length + 1];
        System.arraycopy(movies, 0, temp, 0, movies.length);
    }
    public String[] findAll() {
        return movies;
    }
    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] rev = new String[resultLength];
        for (int i = 0; i < rev.length; i++) {
            rev[i] = movies[movies.length - 1 - i];
        }
        return rev;
    }
}