import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{

		NoFrame frame = new NoFrame();

		Ghost ghost = frame.addGhost(new Location(9,11),"blah",Color.red);
		frame.startGame();

		ArrayList<Location> moves = ghost.get_valid_moves();
		System.out.println(moves);

		//ERROR IN README these are the only locations one can access//
		assertTrue(moves.contains(new Location(9,12)));
		assertTrue(moves.contains(new Location(10,11)));
		assertFalse(moves.contains(new Location(10,12)));


	}

}
