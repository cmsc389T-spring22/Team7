import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert.*;
import org.junit.Test;

public class TestGhostInRange extends TestCase {

	@Test
	public void testGhostInRange() {
		
		MainFrame frame = null;
		
		try {
			frame = new MainFrame();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Ghost ghost = frame.addGhost(new Location(9, 11), "name", Color.red);
		PacMan pacman = frame.addPacMan(new Location(9, 12));
		assertEquals(true, pacman.is_ghost_in_range());
	}
}

