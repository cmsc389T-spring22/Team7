import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Test;

public class TestGhostMove extends TestCase {

	@Test
	public void testGhostMoveI() throws FileNotFoundException{
			
		// Creating A Map
		NoFrame frame = null;

		try {
			frame = new NoFrame();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Creates a orange ghost named "clyde" at location x,y
		Ghost ghost = frame.addGhost(new Location(0, 1), "clyde", Color.orange);
		ghost.move();
		assertFalse(new Location(0,1) == ghost.myLoc); 
	}
}