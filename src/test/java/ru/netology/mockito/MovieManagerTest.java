package ru.netology.mockito;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MovieManagerTest {
    @Test
    public void noMovieTest() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void movieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void maxMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void moreMaxMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void conversMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void maxConversMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void MoreMaxConversMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");
        manager.addMovie("Отель");
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}