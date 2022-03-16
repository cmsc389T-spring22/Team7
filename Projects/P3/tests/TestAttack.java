import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.awt.Color;

public class TestAttack extends TestCase {

	@Test
	public void testAttack() throws FileNotFoundException{

		NoFrame frame = null;
		

		frame = new NoFrame();

		PacMan pacman = frame.addPacMan(new Location(9, 11));
		Ghost ghost = frame.addGhost(new Location(9, 12), "Robert", Color.red);

		assertTrue(ghost.attack());

	

	}
}
