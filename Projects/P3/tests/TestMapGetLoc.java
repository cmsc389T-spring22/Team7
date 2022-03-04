import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashSet;

public class TestMapGetLoc {

	@Test
	public void testMapGetLocI() {

		// Creating A Map
		MainFrame frame = null;

		try {
			frame = new MainFrame();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		frame.addPacMan(new Location(1, 0)); // Creates PacMan at location 1, 0
		
		Map map = frame.getMap();
		HashSet<Map.Type> type = map.getLoc(new Location(1, 0));

		assertEquals(true, type.contains(Map.Type.PACMAN)); // location should contain pacman
	}
	
	@Test
	public void testMapGetLocII() {

		// Creating A Map
		MainFrame frame = null;

		try {
			frame = new MainFrame();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		frame.addPacMan(new Location(1, 0)); // Creates PacMan at location 1, 0
		
		Map map = frame.getMap();
		HashSet<Map.Type> type = map.getLoc(new Location(2, 0));

		assertEquals(false, type.contains(Map.Type.PACMAN)); // location should not contain pacman
	}
}
