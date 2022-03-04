import junit.framework.*;
import java.awt.Color;
import java.io.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestGhostMove extends TestCase {

	// this test should fail
	
	@Test
	public void testGhostMoveFail() throws FileNotFoundException{
		
		// Creating A Map
		MainFrame frame = null;

		try {
			frame = new MainFrame();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Creates a red ghost named "name" at location x,y
		Ghost ghost = frame.addGhost(new Location(0, 1), "clyde", Color.orange); 
		ghost.move();

		assertEquals(new Location(1, 0), ghost.myLoc); // should fail
	}
	
	// this test should pass

	@Test
	public void testGhostMovePass() throws FileNotFoundException{
			
		// Creating A Map
		MainFrame frame = null;

		try {
			frame = new MainFrame();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Creates a red ghost named "name" at location x,y
		Ghost ghost = frame.addGhost(new Location(0, 1), "clyde", Color.orange);
		ghost.move();

		assertNotEquals(new Location(1, 0), ghost.myLoc); // should pass
	}
}