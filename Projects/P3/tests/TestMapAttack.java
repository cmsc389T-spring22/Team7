import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert.*;
import org.junit.Test;

public class TestMapAttack extends TestCase{

	@Test
	public void testAttack1()throws FileNotFoundException{
		
		NoFrame frame = null;
		
		try {
			frame = new NoFrame();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Ghost ghost = frame.addGhost(new Location(9, 11), "clyde", Color.orange);
		PacMan pacman = frame.addPacMan(new Location(9, 12));
		assertEquals(true, frame.getMap().attack("clyde"));
	}
	
	@Test
	public void testAttack2()throws FileNotFoundException {
		
		NoFrame frame = null;
		
		try {
			frame = new NoFrame();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Ghost ghost = frame.addGhost(new Location(9, 8), "clyde", Color.orange);
		PacMan pacman = frame.addPacMan(new Location(9, 12));
		assertEquals(false, frame.getMap().attack("clyde"));
	}
	
}
