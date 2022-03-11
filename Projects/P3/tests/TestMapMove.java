import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMapMove {
	@Test
	public void testMapMove(){
		NoFrame frame = null;

		//NoFrame frame = null ;
		try {
			frame = new NoFrame();
			PacMan pacman = frame.addPacMan(new Location(1, 2));
			//frame.initPlayers();
		} catch (FileNotFoundException e){
			System.out.println(e);
		}
		//Pacman pacman = frame.addPacMan(new Location(1,1));
		Map map = frame.getMap();
		//places we can move
		assertEquals(true, map.move("pacman", new Location(1, 2), Map.Type.PACMAN));
		assertEquals(true, map.move("pacman", new Location(1, 1), Map.Type.PACMAN));
		//wall @ top left corner
		assertEquals(false, map.move("pacman", new Location(0, 0), Map.Type.PACMAN));
		//out of bounds
		assertEquals(false, map.move("pacman", new Location(23, 15), Map.Type.PACMAN));

	}
}
