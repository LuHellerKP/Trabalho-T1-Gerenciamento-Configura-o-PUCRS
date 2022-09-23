package beetask;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class MainTest {

    @Test
    public void umaPartida() throws FileNotFoundException {
        int[] expected = { 1, 0 };
        assertArrayEquals(Main.getResults("oneMatch.txt"), expected);
    }

    @Test
    public void duasPartidas() throws FileNotFoundException {
        int[] expected = { 1, 1 };
        assertArrayEquals(Main.getResults("twoMatches.txt"), expected);
    }

    @Test
    public void cincoPartidas() throws FileNotFoundException {
        int[] expected = { 3, 2 };
        assertArrayEquals(Main.getResults("fiveMatches.txt"), expected);
    }

}