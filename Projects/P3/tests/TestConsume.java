import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.assertEquals;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {

		MainFrame frame = null;


			frame = new MainFrame();
			Location location = new Location(9, 12);
			PacMan pacman = frame.addPacMan(location);
			CookieComponent cookie = CookieComponent(9, 12, 20);
			frame.add(cookie);
			
			pacman.consume();
			//frame.initPlayers();
	
;
		Map map = frame.getMap();
		assertEquals(pacman.consume() == cookie);
	
	}
}
