import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashSet;

public class TestMapGetLoc {

	@Test
	public void testMapGetLoc() {

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

		assertEquals(true, type.contains(Map.Type.PACMAN));
	}
}
