package Model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FeltTest {

    @Test
    public void initBuyable() {
        Felt felt = new Felt(Color.ORANGE, 1, "Test-sted");
        assertTrue(felt.ownable);
    }

    @Test
    public void initNotBuyable() {
        Felt felt = new Felt(Color.ORANGE, 0, "Test-sted");
        assertFalse(felt.ownable);
    }

    @Test
    public void setOwner() {
        Player player = new Player(1000, "P1");
        Felt felt = new Felt(Color.ORANGE, 1, "Test-sted");
        assertNull(felt.getOwner());
        felt.setOwner(player);
        assertEquals(player, felt.getOwner());
    }
}