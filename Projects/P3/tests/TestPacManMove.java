import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestPacManMove extends TestCase {
	
	@Test
	public void testPacManMoveI() throws FileNotFoundException {

		// Creating A Map
		MainFrame frame = null;

		try {
			frame = new MainFrame();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		PacMan pacman = frame.addPacMan(new Location(1, 0)); // Creates PacMan at location 1, 0
		// Ghost ghost = frame.addGhost(new Location(1, 0), "name", Color.red);
		
		pacman.move();

		Map map = frame.getMap();
		map.getLoc(new Location(1, 0));
		//assertFalse(new Location(1,0) == pacman.myLoc);
		assertNotEquals(new Location(1, 0), pacman.myLoc); // should pass because pacman's location has changed
	}
}
