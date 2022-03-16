import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert.*;
import org.junit.Test;

public class TestGhostInRange extends TestCase {


	@Test
	public void testGhostInRange1()throws FileNotFoundException {
		
		NoFrame frame = null;
		
		try {
			frame = new NoFrame();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Ghost ghost = frame.addGhost(new Location(9, 11), "name", Color.red);
		PacMan pacman = frame.addPacMan(new Location(9, 12));
		assertEquals(true, pacman.is_ghost_in_range());

	}
	
	@Test
	public void testGhostInRange2()throws FileNotFoundException {
		
		NoFrame frame = null;
		
		try {
			frame = new NoFrame();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Ghost ghost = frame.addGhost(new Location(9, 8), "name", Color.red);
		PacMan pacman = frame.addPacMan(new Location(9, 12));
		assertEquals(false, pacman.is_ghost_in_range());
	}


}
