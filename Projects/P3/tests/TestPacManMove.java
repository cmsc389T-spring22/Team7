import junit.framework.*;
import java.awt.Color;
import java.io.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashSet;

public class TestPacManMove extends TestCase {

	// this test should fail
	
	@Test
	public void testPacManMoveFail() throws FileNotFoundException {

		// Creating A Map
		MainFrame frame = null;

		try {
			frame = new MainFrame();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		PacMan pacman = frame.addPacMan(new Location(1, 0)); // Creates PacMan at location 1, 0
		pacman.move();

		Map map = frame.getMap();
		map.getLoc(new Location(1, 0));

		System.out.println("myLoc " + pacman.myLoc);
		System.out.println("map.getLoc(new Location(1, 0)) " + map.getLoc(new Location(1, 0)));

		assertEquals(new Location(1, 0), pacman.myLoc); // should fail
	}
	
	// this test should pass
	
	@Test
	public void testPacManMovePass() throws FileNotFoundException {

		// Creating A Map
		MainFrame frame = null;

		try {
			frame = new MainFrame();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		PacMan pacman = frame.addPacMan(new Location(1, 0)); // Creates PacMan at location 1, 0
		pacman.move();

		Map map = frame.getMap();
		map.getLoc(new Location(1, 0));

		System.out.println("myLoc " + pacman.myLoc);
		System.out.println("map.getLoc(new Location(1, 0)) " + map.getLoc(new Location(1, 0)));

		assertNotEquals(new Location(1, 0), pacman.myLoc); // should pass
	}
}
