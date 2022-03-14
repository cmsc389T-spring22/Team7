import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {

		NoFrame frame = null;

			frame = new NoFrame();
			Location location = new Location(1, 1);
			PacMan pacman = frame.addPacMan(location);

		assertTrue(pacman.consume() != null);
	
	}
}
