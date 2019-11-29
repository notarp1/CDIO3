package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void createPlayer() {
        Player player = new Player(1000, "P1");
        assertEquals("P1", player.getPlayerName());
        assertEquals("P1", player.toString());
        assertEquals(1000, player.account.balance);
        assertEquals(0, player.currentFelt);
        assertEquals(0, player.previousFelt);
    }

    @Test
    public void negativeUpdateBalance() {
        Player player = new Player(1000, "P1");
        player.updateBalance(-100);
        assertEquals(900, player.account.balance);
    }

    @Test
    public void positiveUpdateBalance() {
        Player player = new Player(1000, "P1");
        player.updateBalance(100);
        assertEquals(1100, player.account.balance);
    }

    @Test
    public void move() {
        Player player = new Player(1000, "P1");
        player.move(10);
        assertEquals(10, player.currentFelt);
        assertEquals(0, player.previousFelt);
        assertFalse(player.passedStart);
        player.move(20);
        assertEquals(6, player.currentFelt);
        assertEquals(10, player.previousFelt);
        assertTrue(player.passedStart);
    }

    @Test
    public void moveTo() {
        Player player = new Player(1000, "P1");
        player.moveTo(20, true);
        assertEquals(20, player.currentFelt);
        assertEquals(0, player.previousFelt);
        assertFalse(player.passedStart);
        player.moveTo(10, false);
        assertEquals(10, player.currentFelt);
        assertEquals(20, player.previousFelt);
        assertFalse(player.passedStart);
        player.moveTo(5, true);
        assertEquals(5, player.currentFelt);
        assertEquals(10, player.previousFelt);
        assertTrue(player.passedStart);
    }

    @Test
    public void testMoveTo() {
        Player player = new Player(1000, "P1");
        player.moveTo(20);
        assertEquals(20, player.currentFelt);
        assertEquals(0, player.previousFelt);
        assertFalse(player.passedStart);
        player.moveTo(10);
        assertEquals(10, player.currentFelt);
        assertEquals(20, player.previousFelt);
        assertFalse(player.passedStart);
        player.moveTo(5);
        assertEquals(5, player.currentFelt);
        assertEquals(10, player.previousFelt);
        assertFalse(player.passedStart);
    }

    @Test
    public void giveFreeBee() {
        Player player = new Player(1000, "P1");
        assertFalse(player.hasFreeBee());
        player.giveFreeBee();
        assertTrue(player.hasFreeBee());
        player.useFreeBee();
        assertFalse(player.hasFreeBee());
    }

    @Test
    public void setJailPass() {
        Player player = new Player(1000, "P1");
        assertFalse(player.getJailPass());
        player.setJailPass(true);
        assertTrue(player.getJailPass());
        player.setJailPass(false);
        assertFalse(player.getJailPass());
    }
}