package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShakerTest {

    @Test
    public void shake() {
        Shaker shaker = new Shaker();
        int sum = shaker.rollDice();
        assertTrue((1 <= sum && sum <= 6));
    }
}