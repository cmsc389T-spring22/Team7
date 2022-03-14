import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.awt.Color;

public class TestAttack extends TestCase {

	@Test
	public void testAttack() throws FileNotFoundException{

		MainFrame frame = null;
		

		frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		Ghost ghost = frame.addGhost(new Location(1, 2), "Robert", Color.red);
		System.out.print(ghost.attack());
		assertTrue(ghost.attack());

	

	}
}
