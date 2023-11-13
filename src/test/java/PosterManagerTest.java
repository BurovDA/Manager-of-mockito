import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void NoMovies() {
        PosterManager manager = new PosterManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void OutputOrderAdditionMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("6");

        String[] actual = manager.findAll();
        String[] expected = {"1", "2", "3", "4", "5", "6"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MaxLimitMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("6");


        String[] actual = manager.findLast();
        String[] expected = {"6", "5", "4", "3", "2"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void LimitMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");

        String[] actual = manager.findLast();
        String[] expected = {"4", "3", "2"};

        Assertions.assertArrayEquals(expected, actual);

    }
}
