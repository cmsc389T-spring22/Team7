import junit.framework.*;
import java.io.*;
import org.junit.Test;

public class TestPacManMove extends TestCase {
	
	@Test
	public void testPacManMoveI() throws FileNotFoundException {

		// Creating A Map
		NoFrame frame = null;

		try {
			frame = new NoFrame();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Create a PacMan at location 1, 0
		PacMan pacman = frame.addPacMan(new Location(1, 0));
		
		pacman.move();

		Map map = frame.getMap();
		map.getLoc(new Location(1, 0));
		assertFalse(new Location(1, 0) == pacman.myLoc);
	}
}