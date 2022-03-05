import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {



	public void testGhostInRange() throws FileNotFoundException{

	@Test
	public void testGhostInRange1() {
		
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
	
	@Test
	public void testGhostInRange2() {
		
		MainFrame frame = null;
		
		try {
			frame = new MainFrame();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Ghost ghost = frame.addGhost(new Location(9, 8), "name", Color.red);
		PacMan pacman = frame.addPacMan(new Location(9, 12));
		assertEquals(false, pacman.is_ghost_in_range());
	}
}

