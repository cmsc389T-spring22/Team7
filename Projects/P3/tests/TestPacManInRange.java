import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert.*;
import org.junit.Test;

public class TestPacManInRange extends TestCase {

	
	@Test
	public void testPacManInRange1() {
		
		MainFrame frame = null;
		
		try {
			frame = new MainFrame();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Ghost ghost = frame.addGhost(new Location(9, 11), "name", Color.red);
		PacMan pacman = frame.addPacMan(new Location(9, 12));
		assertEquals(true, ghost.is_pacman_in_range());
	}
	
	@Test
	public void testPacManInRange2() {
		
		MainFrame frame = null;
		
		try {
			frame = new MainFrame();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Ghost ghost = frame.addGhost(new Location(9, 8), "name", Color.red);
		PacMan pacman = frame.addPacMan(new Location(9, 12));
		assertEquals(false, ghost.is_pacman_in_range());
	}
	
	
}
