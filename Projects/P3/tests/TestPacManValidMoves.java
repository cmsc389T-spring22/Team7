import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestPacManValidMoves extends TestCase {


	public void testPacManValidMoves() throws FileNotFoundException{

		NoFrame frame = new NoFrame();

		PacMan pacman = frame.addPacMan(new Location(9,11));
		frame.startGame();

		ArrayList<Location> moves = pacman.get_valid_moves();
		//System.out.println(moves);

		//ERROR IN README these are the only locations one can access//
		assertTrue(moves.contains(new Location(9,12)));
		assertTrue(moves.contains(new Location(10,11)));


	}
}