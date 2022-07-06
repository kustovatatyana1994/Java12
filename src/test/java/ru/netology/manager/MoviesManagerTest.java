package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesManagerTest {

    @Test

    public void shouldFindAllMovies() {
        MoviesManager manager = new MoviesManager();

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");

        String[] expected = { "Movie1", "Movie2", "Movie3" };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastMoviesWithLimitByDefault() {
        MoviesManager manager = new MoviesManager();

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");
        manager.add("Movie9");
        manager.add("Movie10");
        manager.add("Movie11");
        manager.add("Movie12");

        String[] expected = { "Movie12", "Movie11", "Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3" };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastMoviesWithLimit() {
        MoviesManager manager = new MoviesManager(5);

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");
        manager.add("Movie9");
        manager.add("Movie10");
        manager.add("Movie11");
        manager.add("Movie12");

        String[] expected = { "Movie12", "Movie11", "Movie10", "Movie9", "Movie8", };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastMoviesWithLimitMoreMovies() {
        MoviesManager manager = new MoviesManager(15);

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");
        manager.add("Movie9");
        manager.add("Movie10");
        manager.add("Movie11");
        manager.add("Movie12");

        String[] expected = { "Movie12", "Movie11", "Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1" };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

}
