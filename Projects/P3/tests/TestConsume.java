import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {

		NoFrame frame = null;

			frame = new NoFrame();
			Location location = new Location(9, 12);
			PacMan pacman = frame.addPacMan(location);
			CookieComponent cookie = new CookieComponent(9, 12, 20);
			frame.add(cookie);
			
			pacman.consume();
			//frame.initPlayers();

		Map map = frame.getMap();
		assertEquals(pacman.consume(), cookie);
	
	}
}
